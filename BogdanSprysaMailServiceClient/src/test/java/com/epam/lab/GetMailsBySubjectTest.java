package com.epam.lab;

import com.epam.lab.rest.MailService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({HTMLReporter.class})
public class GetMailsBySubjectTest {

  public Logger LOGGER = Logger.getLogger(GetMailsBySubjectTest.class);
  public static String subject = "Test";

  @Test
  public void getMailsBySubjectTest() {
    LOGGER.info("getMailsBySubject test");
    MailService service = ServiceFactory.getMailService(ServiceFactory.REST);
    LOGGER.info("Number of mails: " + service.getMailsBySubject(subject));
    Assert.assertNotNull(service.getMailsBySubject(subject));
  }
}