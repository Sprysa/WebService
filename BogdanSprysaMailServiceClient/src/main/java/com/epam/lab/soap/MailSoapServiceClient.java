package com.epam.lab.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "MailSoapServiceClient",
    wsdlLocation = "src/main/resources/service.wsdl",
    targetNamespace = "http://soap.lab.epam.com/")
public class MailSoapServiceClient extends Service {

  public final static URL WSDL_LOCATION;

  public final static QName SERVICE = new QName("http://soap.lab.epam.com/", "MailSoapServiceClient");
  public final static QName MailServiceImplPort = new QName("http://soap.lab.epam.com/", "MailServiceImplPort");
  static {
    URL url = null;
    try {
      url = new URL("src/main/resources/service.wsdl");
    } catch (MalformedURLException e) {
      java.util.logging.Logger.getLogger(MailSoapServiceClient.class.getName())
          .log(java.util.logging.Level.INFO,
              "Can not initialize the default wsdl from {0}", "src/main/resources/service.wsdl");
    }
    WSDL_LOCATION = url;
  }

  public MailSoapServiceClient(URL wsdlLocation) {
    super(wsdlLocation, SERVICE);
  }

  public MailSoapServiceClient(URL wsdlLocation, QName serviceName) {
    super(wsdlLocation, serviceName);
  }

  public MailSoapServiceClient() {
    super(WSDL_LOCATION, SERVICE);
  }

  public MailSoapServiceClient(WebServiceFeature... features) {
    super(WSDL_LOCATION, SERVICE, features);
  }

  public MailSoapServiceClient(URL wsdlLocation, WebServiceFeature ... features) {
    super(wsdlLocation, SERVICE, features);
  }

  public MailSoapServiceClient(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
    super(wsdlLocation, serviceName, features);
  }

  @WebEndpoint(name = "MailServiceImplPort")
  public MailService getMailServiceImplPort() {
    return super.getPort(MailServiceImplPort, MailService.class);
  }

  @WebEndpoint(name = "MailServiceImplPort")
  public MailService getMailServiceImplPort(WebServiceFeature... features) {
    return super.getPort(MailServiceImplPort, MailService.class, features);
  }
}
