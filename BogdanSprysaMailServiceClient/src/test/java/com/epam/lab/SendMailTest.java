package com.epam.lab;

import com.epam.lab.rest.MailService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({HTMLReporter.class})
public class SendMailTest {

  public Logger LOGGER = Logger.getLogger(SendMailTest.class);
  public static Mail mail = new Mail("sprysa@gmail.com", "Test", "First test");

  @Test
  public void sendMailRest() {
    LOGGER.info("sendMailRest test");
    MailService service = ServiceFactory.getMailService(ServiceFactory.REST);
    Assert.assertTrue(service.sendMail(mail));
  }

//  @Test
//  public void sendMailSoap() {
//    LOGGER.info("sendMailSoap test");
//    MailService service = ServiceFactory.getMailService(ServiceFactory.SOAP);
//    Assert.assertTrue(service.sendMail(mail));
//  }

}
