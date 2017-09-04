package br.com.caelum.livraria.camel;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.camel.CamelContext;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
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
				log(LoggingLevel.INFO,"CAMEL: Recebendo MSG ${id}").
				to("jms:queue:jms/FILA.GERADOR?username="+USER_JMS+"&password="+PASS_JMS);				
			}
		});
		
		context.start();
	}
	
	@PreDestroy
	void destroy() throws Exception {
		context.stop();
	}

}
