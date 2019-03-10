package com.epam.lab;

import com.epam.lab.rest.MailService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({HTMLReporter.class})
public class DeleteMailTest {

  public Logger LOGGER = Logger.getLogger(DeleteMailTest.class);
  public static Mail mail = new Mail("sprysa@gmail.com", "Test", "First test");

  @Test
  public void deleteMailTest() {
    LOGGER.info("deleteMail test");
    MailService service = ServiceFactory.getMailService(ServiceFactory.REST);
    Assert.assertTrue(service.deleteMail(mail));
  }
}
