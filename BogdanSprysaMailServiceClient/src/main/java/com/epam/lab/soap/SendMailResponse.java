package com.epam.lab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendMailResponse", propOrder = {
    "_return"
})
public class SendMailResponse {

  @XmlElement(name = "return")
  protected boolean _return;

  public boolean isReturn() {
    return _return;
  }

  public void setReturn(boolean _return) {
    this._return = _return;
  }
}
