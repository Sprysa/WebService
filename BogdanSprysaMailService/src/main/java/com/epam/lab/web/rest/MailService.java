package com.epam.lab.web.rest;

import com.epam.lab.model.Mail;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/mailREST")
public interface MailService {

  @POST
  @Path("/mail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces("application/json; charset=UTF-8")
  Response sendMail(Mail mail);

  @GET
  @Path("/mails")
  @Produces("application/json; charset=UTF-8")
  Response getAllMails();

  @DELETE
  @Path("/mail")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces("application/json; charset=UTF-8")
  Response deleteMail(Mail mail);

  @GET
  @Path("/mails/{email}")
  @Produces("application/json; charset=UTF-8")
  Response getMailsByEmail(@PathParam("email") String email);

  @GET
  @Path("/mails/{subj}")
  @Produces("application/json; charset=UTF-8")
  Response getMailsBySubject(@PathParam("subj") String subj);
}
