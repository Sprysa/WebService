package com.epam.lab.soap;

import com.epam.lab.Mail;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMailsResponse", propOrder = {
    "_return"
})
public class GetAllMailsResponse {

  @XmlElement(name = "return")
  protected List<Mail> _return;

  public List<Mail> get_return() {
    return _return;
  }
}
