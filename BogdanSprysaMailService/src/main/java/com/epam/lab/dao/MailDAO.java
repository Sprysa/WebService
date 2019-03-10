package com.epam.lab.dao;

import com.epam.lab.model.Mail;
import com.epam.lab.utills.CSVMailManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import org.apache.log4j.Logger;

public class MailDAO {

  public static final String MAIL_URl = "src/main/resources/mails.csv";
  private static Logger LOGGER = Logger.getLogger(MailDAO.class);

  public static boolean addMail(Mail mail) {
    LOGGER.info("addMail method");
    List<Mail> mailList = CSVMailManager.readMails(new File(MAIL_URl));
    boolean isAdded;
    if (!mailList.contains(mail)) {
      mailList.add(mail);
      CSVMailManager.writeMails(mailList, new File(MAIL_URl));
      isAdded = true;
    } else {
      isAdded = false;
    }
    return isAdded;
  }

  public static List<Mail> getAllMails() {
    LOGGER.info("getAllMails method");
    return CSVMailManager.readMails(new File(MAIL_URl));
  }

  public static boolean deleteMail(Mail mail) {
    LOGGER.info("deleteMail method");
    List<Mail> mailList = CSVMailManager.readMails(new File(MAIL_URl));
    ListIterator<Mail> it = mailList.listIterator();
    boolean isDeleted = false;
      while (it.hasNext()) {
        Mail mailIt = it.next();
        if (mailIt.equals(mail)) {
          it.remove();
          CSVMailManager.writeMails(mailList, new File(MAIL_URl));
          isDeleted = true;
          break;
        }
    }
    return isDeleted;
  }

  public static List<Mail> getMailsByEmail(String email) {
    LOGGER.info("getMailsByEmail method");
    List<Mail> mailList = CSVMailManager.readMails(new File(MAIL_URl));
    List<Mail> mailListByEmail = new ArrayList<Mail>();
    ListIterator<Mail> it = mailList.listIterator();
    while (it.hasNext()) {
      Mail mailIt = it.next();
      if (mailIt.getEmail().equals(email)) {
        mailListByEmail.add(mailIt);
      }
    }
    return mailListByEmail;
  }

  public static List<Mail> getMailsBySubject(String subj) {
    LOGGER.info("getMailsBySubject method");
    List<Mail> mailList = CSVMailManager.readMails(new File(MAIL_URl));
    List<Mail> mailListBySubject = new ArrayList<Mail>();
    ListIterator<Mail> it = mailList.listIterator();
    while (it.hasNext()) {
      Mail mailIt = it.next();
      if (mailIt.getSubj().equals(subj)) {
        mailListBySubject.add(mailIt);
      }
    }
    return mailListBySubject;
  }


}
