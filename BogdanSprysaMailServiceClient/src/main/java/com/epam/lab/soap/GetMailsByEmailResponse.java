package com.epam.lab.soap;

import com.epam.lab.Mail;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMailsByEmailResponse", propOrder = {
    "_return"
})
public class GetMailsByEmailResponse {

  @XmlElement(name = "return")
  protected List<Mail> _return;

  public List<Mail> get_return() {
    if (_return == null) {
      _return = new ArrayList<Mail>();
    }
    return this._return;
  }
}
