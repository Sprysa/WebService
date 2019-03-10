package com.epam.lab;

import com.epam.lab.rest.MailService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({HTMLReporter.class})
public class GetAllMailsTest {

  public Logger LOGGER = Logger.getLogger(GetAllMailsTest.class);

  @Test
  public void getAllMailsTest() {
    LOGGER.info("getAllMails test");
    MailService service = ServiceFactory.getMailService(ServiceFactory.REST);
    LOGGER.info("Number of mails: " + service.getAllMails().size());
    Assert.assertNotNull(service.getAllMails());
  }
}
