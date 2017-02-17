package spring.jms.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.jms.JMSProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/mydocuments-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyDocumentsTest {

	private static final Logger log = LoggerFactory.getLogger(MyDocumentsTest.class);
	
	@Autowired
	JMSProducer jmsProducer;

	@Test
	public void testSpringJMS_1() {
		log.debug("Testing Spring JMS Producer...");
		jmsProducer.send();
	}

	@Test
	public void testSpringJMS_2() throws InterruptedException {
		log.debug("Testing Spring JMS Listener/Insert...");

		// Waiting a least 5 seconds so the message is consumed.
		Thread.sleep(5000);

		// // After the JMS message and insert, must be 5 Documents
		// assertEquals(MAX_ALL_DOCS, engine.listAll().size());
		// Type documentType = new Type("WEB", ".url");
		// assertEquals(MAX_WEB_DOCS, engine.findByType(documentType).size());
	}
}
