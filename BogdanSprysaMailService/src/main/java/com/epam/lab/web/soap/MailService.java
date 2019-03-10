package com.epam.lab.web.soap;

import com.epam.lab.model.Mail;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface MailService {

  boolean sendMail(Mail mail);

  List<Mail> getAllMails();

  boolean deleteMail(Mail mail);

  List<Mail> getMailsByEmail(String email);

  List<Mail> getMailsBySubject(String subj);
}
