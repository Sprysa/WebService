package com.epam.lab.web.soap;

import com.epam.lab.bo.MailBO;
import com.epam.lab.model.Mail;
import java.util.List;
import javax.jws.WebService;
import org.apache.log4j.Logger;

@WebService(endpointInterface = "com.epam.lab.web.soap.MailService")
public class MailServiceImpl implements MailService {

  private Logger LOGGER = Logger.getLogger(MailService.class);

  @Override
  public boolean sendMail(Mail mail) {
    LOGGER.info("sendMail method");
    MailBO mailBO = new MailBO();
    return mailBO.sendMail(mail);
  }

  @Override
  public List<Mail> getAllMails() {
    LOGGER.info("getAllMails method");
    MailBO mailBO = new MailBO();
    return mailBO.getAllMails();
  }

  @Override
  public boolean deleteMail(Mail mail) {
    LOGGER.info("deleteMail method");
    MailBO mailBO = new MailBO();
    return mailBO.deleteMail(mail);
  }

  @Override
  public List<Mail> getMailsByEmail(String email) {
    LOGGER.info("getMailsByEmail method");
    MailBO mailBO = new MailBO();
    return mailBO.getMailsByEmail(email);
  }

  @Override
  public List<Mail> getMailsBySubject(String subj) {
    LOGGER.info("getMailsBySubject method");
    MailBO mailBO = new MailBO();
    return mailBO.getMailsBySubject(subj);
  }
}
