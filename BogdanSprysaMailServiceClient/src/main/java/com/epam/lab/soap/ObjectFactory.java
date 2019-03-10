package com.epam.lab.soap;

import com.epam.lab.Mail;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.namespace.QName;

public class ObjectFactory {

  private final static QName SEND_MAIL_QNAME = new QName("http://soap.lab.epam.com/", "sendMail");
  private final static QName SEND_MAIL_RESPONSE_QNAME = new QName("http://soap.lab.epam.com/", "sendMailResponse");
  private final static QName GET_ALL_MAILS_QNAME = new QName("http://soap.lab.epam.com/", "getAllMails");
  private final static QName GET_ALL_MAILS_RESPONSE_QNAME = new QName("http://soap.lab.epam.com/", "getAllMailsResponse");
  private final static QName DELETE_MAIL__QNAME = new QName("http://soap.lab.epam.com/", "deleteMail");
  private final static QName DELETE_MAIL__RESPONSE_QNAME = new QName("http://soap.lab.epam.com/", "deleteMailResponse");
  private final static QName GET_MAILS_BY_EMAIL_QNAME = new QName("http://soap.lab.epam.com/", "getMailsByEmail");
  private final static QName GET_MAILS_BY_EMAIL_RESPONSE_QNAME = new QName("http://soap.lab.epam.com/", "getMailsByEmailResponse");
  private final static QName GET_MAILS_BY_SUBJECT_QNAME = new QName("http://soap.lab.epam.com/", "getMailsBySubject");
  private final static QName GET_MAILS_BY_SUBJECT_RESPONSE_QNAME = new QName("http://soap.lab.epam.com/", "getMailsBySubjectResponse");

  public ObjectFactory() {
  }

  public SendMail createSendMail() {return new SendMail();}

  public SendMailResponse createSendMailResponse() {return new SendMailResponse();}

  public GetAllMails createGetAllMails() {return new GetAllMails();}

  public GetAllMailsResponse createGetAllMailsResponse() {return new GetAllMailsResponse();}

  public DeleteMail createDeleteMail() {return new DeleteMail();}

  public DeleteMailResponse createDeleteMailResponse() {return new DeleteMailResponse();}

  public GetMailsByEmail createGetMailsByEmail() {return new GetMailsByEmail();}

  public GetMailsByEmailResponse createGetMailsByEmailResponse() {return new GetMailsByEmailResponse();}

  public GetMailsBySubject createGetMailsBySubject() {return new GetMailsBySubject();}

  public GetMailsBySubjectResponse createGetMailsBySubjectResponse() {return new GetMailsBySubjectResponse();}

  public Mail createMail() {return new Mail();}

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "sendMail")
  public JAXBElement<SendMail> createSendMail(SendMail value) {
    return new JAXBElement<SendMail>(SEND_MAIL_QNAME, SendMail.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "sendMailResponse")
  public JAXBElement<SendMailResponse> createSendMailResponse(SendMailResponse value) {
    return new JAXBElement<SendMailResponse>(SEND_MAIL_RESPONSE_QNAME, SendMailResponse.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getAllMails")
  public JAXBElement<GetAllMails> createGetAllMails(GetAllMails value) {
    return new JAXBElement<GetAllMails>(GET_ALL_MAILS_QNAME, GetAllMails.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getAllMailsResponse")
  public JAXBElement<GetAllMailsResponse> createGetAllMailsResponse(GetAllMailsResponse value) {
    return new JAXBElement<GetAllMailsResponse>(GET_ALL_MAILS_RESPONSE_QNAME, GetAllMailsResponse.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "deleteMail")
  public JAXBElement<DeleteMail> createDeleteMail(DeleteMail value) {
    return new JAXBElement<DeleteMail>(DELETE_MAIL__QNAME, DeleteMail.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "deleteMailResponse")
  public JAXBElement<DeleteMailResponse> createDeleteMailResponse(DeleteMailResponse value) {
    return new JAXBElement<DeleteMailResponse>(DELETE_MAIL__RESPONSE_QNAME, DeleteMailResponse.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getMailsByEmail")
  public JAXBElement<GetMailsByEmail> createGetMailsByEmail(GetMailsByEmail value) {
    return new JAXBElement<GetMailsByEmail>(GET_MAILS_BY_EMAIL_QNAME, GetMailsByEmail.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getMailsByEmailResponse")
  public JAXBElement<GetMailsByEmailResponse> createGetMailsByEmailResponse(GetMailsByEmailResponse value) {
    return new JAXBElement<GetMailsByEmailResponse>(GET_MAILS_BY_EMAIL_RESPONSE_QNAME, GetMailsByEmailResponse.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getMailsBySubject")
  public JAXBElement<GetMailsBySubject> createGetMailsBySubject(GetMailsBySubject value) {
    return new JAXBElement<GetMailsBySubject>(GET_MAILS_BY_SUBJECT_QNAME, GetMailsBySubject.class, null, value);
  }

  @XmlElementDecl(namespace = "http://soap.lab.epam.com/", name = "getMailsBySubjectResponse")
  public JAXBElement<GetMailsBySubjectResponse> createGetMailsBySubjectResponse(GetMailsBySubjectResponse value) {
    return new JAXBElement<GetMailsBySubjectResponse>(GET_MAILS_BY_SUBJECT_RESPONSE_QNAME, GetMailsBySubjectResponse.class, null, value);
  }
}
