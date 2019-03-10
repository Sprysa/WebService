package com.epam.lab.bo;

import com.epam.lab.dao.MailDAO;
import com.epam.lab.model.Mail;
import java.util.List;

public class MailBO {

  public boolean sendMail(Mail mail) {
    return MailDAO.addMail(mail);
  }

  public List<Mail> getAllMails() {
    return MailDAO.getAllMails();
  }

  public boolean deleteMail(Mail mail) {
    return MailDAO.deleteMail(mail);
  }

  public List<Mail> getMailsByEmail(String email) {
    return MailDAO.getMailsByEmail(email);
  }

  public List<Mail> getMailsBySubject(String subj) {
    return MailDAO.getMailsBySubject(subj);
  }

}
