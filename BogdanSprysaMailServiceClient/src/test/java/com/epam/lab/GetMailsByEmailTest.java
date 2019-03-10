package com.epam.lab;

import com.epam.lab.rest.MailService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({HTMLReporter.class})
public class GetMailsByEmailTest {

  public Logger LOGGER = Logger.getLogger(GetMailsByEmailTest.class);
  public static String email = "sprysa@gmail.com";

  @Test
  public void getMailsByEmailTest() {
    LOGGER.info("getMailsByEmail test");
    MailService service = ServiceFactory.getMailService(ServiceFactory.REST);
    LOGGER.info("Number of mails: " + service.getMailsByEmail(email));
    Assert.assertNotNull(service.getMailsByEmail(email));
  }
}
