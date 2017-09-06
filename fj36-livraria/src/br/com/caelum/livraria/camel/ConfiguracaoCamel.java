package br.com.caelum.livraria.camel;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConfiguracaoCamel {

	private static String USER_JMS = "jms";
	private static String PASS_JMS = "jms2";
	
	@Autowired
	private CamelContext context;

	@PostConstruct
	void init() throws Exception {
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("jms:topic:jms/TOPICO.LIVRARIA?username="+USER_JMS+"&password="+PASS_JMS).
				to("direct:notas").
				log(LoggingLevel.INFO,"CAMEL: Recebendo MSG ${id}").
//				filter().
//					xpath("/pedido/itens/item/formato[text()='EBOOK']").
//				split().xpath("/pedido/itens").
				split().
				xpath("/pedido/itens/item/formato[text()='EBOOK']/..").
				to("direct:agg");
				
				from("direct:agg").
				aggregate(constant(true), new AggregationStrategy() {
					
					@Override
					public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
						if (oldExchange == null) {
							return newExchange;
						}				
						
						String oldBody = oldExchange.getIn().getBody(String.class);
						String newBody = newExchange.getIn().getBody(String.class);
						
						oldExchange.getIn().setBody(oldBody + newBody);
						
						return oldExchange;
						
					}
				}).completionSize(header("camelSplitSize")).
				transform(simple("<itens>${body}</itens>")).
				to("jms:queue:jms/FILA.GERADOR?username="+USER_JMS+"&password="+PASS_JMS);				

				
				from("direct:notas").
				setHeader("data",constant(new SimpleDateFormat("dd/MM/yyyy").format(new Date()))).
				split().
				xpath("/pedido/pagamento").
				convertBodyTo(String.class).
				to("velocity:nota.vm").
				log(LoggingLevel.INFO, "CAMEL: MSG Transformado com Velocity \n ${body}");
				
			}
		});
		
		context.start();
	}
	
	@PreDestroy
	void destroy() throws Exception {
		context.stop();
	}

}
