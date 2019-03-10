package com.epam.lab;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mail", propOrder = {
    "email",
    "subj",
    "body"
})
public class Mail {

  private String email;
  private String subj;
  private String body;

  public Mail() {}

  public Mail(String email, String subj, String body) {
    this.email = email;
    this.subj = subj;
    this.body = body;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSubj() {
    return subj;
  }

  public void setSubj(String subj) {
    this.subj = subj;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Mail)) return false;

    Mail mail = (Mail) o;

    if (getEmail() != null ? !getEmail().equals(mail.getEmail()) : mail.getEmail() != null) return false;
    if (getSubj() != null ? !getSubj().equals(mail.getSubj()) : mail.getSubj() != null)
      return false;
    return getBody() != null ? getBody().equals(mail.getBody()) : mail.getBody() == null;
  }

  @Override
  public int hashCode() {
    int result = getEmail() != null ? getEmail().hashCode() : 0;
    result = 31 * result + (getSubj() != null ? getSubj().hashCode() : 0);
    result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Mail{" +
        "email='" + email + '\'' +
        ", subj='" + subj + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
