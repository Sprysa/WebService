package com.epam.lab.soap;

import com.epam.lab.Mail;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMails")
public class GetAllMails {

  protected List<Mail> arg0;

  public List<Mail> getArg0() {
    return arg0;
  }

  public void setArg0(List<Mail> arg0) {
    this.arg0 = arg0;
  }
}
