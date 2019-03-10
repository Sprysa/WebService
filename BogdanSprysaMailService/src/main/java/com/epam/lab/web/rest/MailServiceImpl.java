package com.epam.lab.web.rest;

import com.epam.lab.bo.MailBO;
import com.epam.lab.model.Mail;
import java.util.List;
import java.util.Objects;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;

public class MailServiceImpl implements MailService {
  private Logger LOGGER = Logger.getLogger(MailServiceImpl.class);

  @Override
  public Response sendMail(Mail mail) {
    LOGGER.info("sendMail method");
    Response response;
    MailBO mailBO = new MailBO();
    if (mailBO.sendMail(mail)) {
      response = Response.ok().build();
    } else {
      LOGGER.warn("Such mail already exist");
      response = Response.status(Response.Status.NOT_ACCEPTABLE).build();
    }
    return response;
  }

  @Override
  public Response getAllMails() {
    LOGGER.info("getAllMails method");
    MailBO mailBO = new MailBO();
    return Response.ok().entity(mailBO.getAllMails()).build();
  }

  @Override
  public Response deleteMail(Mail mail) {
    LOGGER.info("deleteMail method");
    Response response;
    MailBO mailBO = new MailBO();
    if (!mailBO.deleteMail(mail)) {
      LOGGER.warn("Such mail not exist");
      response = Response.status(Response.Status.NOT_ACCEPTABLE).build();
    } else {
      response = Response.ok().build();
    }
    return response;
  }

  @Override
  public Response getMailsByEmail(String email) {
    LOGGER.info("getMailsByEmail method");
    Response response;
    MailBO mailBO = new MailBO();
    List<Mail> mails = mailBO.getMailsByEmail(email);
    if (Objects.isNull(mails)) {
      LOGGER.warn("Such mails not exist");
      response = Response.status(Response.Status.NOT_FOUND).build();
    } else {
      response = Response.ok().entity(mails).build();
    }
    return response;
  }

  @Override
  public Response getMailsBySubject(String subj) {
    LOGGER.info("getMailsBySubject method");
    Response response;
    MailBO mailBO = new MailBO();
    List<Mail> mails = mailBO.getMailsBySubject(subj);
    if (Objects.isNull(mails)) {
      LOGGER.warn("Such mails not exist");
      response = Response.status(Response.Status.NOT_FOUND).build();
    } else {
      response = Response.ok().entity(mails).build();
    }
    return response;
  }
}
