package com.epam.lab.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMailResponse", propOrder = {
    "_return"
})
public class DeleteMailResponse {

  @XmlElement(name = "return")
  protected boolean _return;

  public boolean is_return() {
    return _return;
  }

  public void set_return(boolean _return) {
    this._return = _return;
  }
}
