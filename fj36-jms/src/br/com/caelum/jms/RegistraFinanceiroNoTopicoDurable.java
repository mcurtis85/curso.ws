package br.com.caelum.jms;

import java.util.Scanner;

import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Topic;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RegistraFinanceiroNoTopicoDurable {

	public static void main(String[] args) throws NamingException {
		InitialContext initialContext = new InitialContext();

		ConnectionFactory factory = (ConnectionFactory) initialContext.lookup("jms/RemoteConnectionFactory");

		Topic topico = (Topic) initialContext.lookup("jms/TOPICO.LIVRARIA");

		try (JMSContext context = factory.createContext("jms", "jms2")) {
			context.setClientID("Financeiro");

			JMSConsumer consumer = context.createDurableConsumer(topico, "AssinaturaNotas","formato='financeiro'",false);
			consumer.setMessageListener(new TratadorDeMensagem());
			context.start();

			Scanner teclado = new Scanner(System.in);
			System.out.println("Financeiro esperando as mensagens");
			System.out.println("Aperte Enter para fechar a conexão");
			teclado.nextLine();
			teclado.close();

			context.stop();
		}

	}

}
