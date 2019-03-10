package com.epam.lab.soap;

import com.epam.lab.Mail;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMail", propOrder = {
    "arg0"
})
public class SendMail {

  protected Mail arg0;

  public Mail getArg0() {
    return arg0;
  }

  public void setArg0(Mail arg0) {
    this.arg0 = arg0;
  }
}
