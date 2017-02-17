package spring.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

import model.Document;
import utils.XmlUtils;

@Component
public class JMSConsumer implements MessageListener {
	

	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		try {
			
			Document document = XmlUtils.fromXML(textMessage.getText(), Document.class);
			System.out.println(document);
			
		} catch (JMSException ex) {
			ex.printStackTrace();
		}
	}
}
