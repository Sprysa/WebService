package com.epam.lab.rest;

import com.epam.lab.Mail;
import java.util.List;

public interface MailService {

  boolean sendMail(Mail mail);

  List<Mail> getAllMails();

  boolean deleteMail(Mail mail);

  List<Mail> getMailsByEmail(String email);

  List<Mail> getMailsBySubject(String subj);

}
