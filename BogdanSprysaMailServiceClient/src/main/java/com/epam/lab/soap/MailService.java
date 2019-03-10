package com.epam.lab.soap;

import com.epam.lab.Mail;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://soap.lab.epam.com/", name = "MailService")
@XmlSeeAlso({ObjectFactory.class})
public interface MailService extends com.epam.lab.rest.MailService {

  @WebMethod
  @RequestWrapper(localName = "sendMail", targetNamespace = "http://soap.web.lab.epam.com/", className = "com.epam.lab.soap.SendMail")
  @ResponseWrapper(localName = "sendMailResponse", targetNamespace = "http://soap.lab.epam.com/", className = "com.epam.lab.soap.SendMailResponse")
  @WebResult(name = "return", targetNamespace = "")
  public boolean sendMail(
      @WebParam(name = "arg0", targetNamespace = "")
          Mail arg0);

  @WebMethod
  @RequestWrapper(localName = "getAllMails", targetNamespace = "http://soap.lab.epam.com/", className = "com.epam.lab.soap.GetAllMails")
  @ResponseWrapper(localName = "getAllMailsResponse", targetNamespace = "http://soap.lab.epam.com/", className = "com.epam.lab.soap.GetAllMailsResponse")
  @WebResult(name = "return", targetNamespace = "")
  public List<Mail> getAllMails();

  @WebMethod
  @RequestWrapper(localName = "deleteMail", targetNamespace = "http://soap.lab.epam.com/", className = "com.epam.lab.soap.DeleteMail")
  @ResponseWrapper(localName = "deleteMailResponse", targetNamespace = "http://soap.lab.epam.com/", className = "com.epam.lab.soap.DeleteMailResponse")
  @WebResult(name = "return", targetNamespace = "")
  public boolean deleteMail(
      @WebParam(name = "arg0", targetNamespace = "")
          Mail arg0);

  @WebMethod
  @RequestWrapper(localName = "getMailsByEmail", targetNamespace = "http://soap.web.lab.epam.com/", className = "com.epam.lab.web.soap.GetMailsByEmail")
  @ResponseWrapper(localName = "getMailsByEmailResponse", targetNamespace = "http://soap.web.lab.epam.com/", className = "com.epam.lab.web.soap.GetMailsByEmailResponse")
  @WebResult(name = "return", targetNamespace = "")
  public List<Mail> getMailsByEmail(
      @WebParam(name = "arg0", targetNamespace = "")
          String arg0);

  @WebMethod
  @RequestWrapper(localName = "getMailsBySubject", targetNamespace = "http://soap.web.lab.epam.com/", className = "com.epam.lab.web.soap.GetMailsBySubject")
  @ResponseWrapper(localName = "getMailsBySubjectResponse", targetNamespace = "http://soap.web.lab.epam.com/", className = "com.epam.lab.web.soap.GetMailsBySubjectResponse")
  @WebResult(name = "return", targetNamespace = "")
  public List<Mail> getMailsBySubject(
      @WebParam(name = "arg0", targetNamespace = "")
          String arg0);
}
