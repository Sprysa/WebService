package com.epam.lab;

import com.epam.lab.rest.MailService;
import com.epam.lab.rest.MailRestServiceClient;
import com.epam.lab.soap.MailSoapServiceClient;
import org.apache.log4j.Logger;

public class ServiceFactory {
    private static Logger LOGGER = Logger.getLogger(ServiceFactory.class);
    public static final String REST = "REST";
    public static final String SOAP = "SOAP";

    public static MailService getMailService(String choice) {
        LOGGER.info("getMailService factory method");
        MailService service;
        if (choice.equals(REST)) {
            LOGGER.info("Creating Rest mail service client");
            service = new MailRestServiceClient();
        } else if (choice.equals(SOAP)) {
            LOGGER.info("Creating Soap mail service client");
            service = new MailSoapServiceClient().getMailServiceImplPort();
        } else {
            LOGGER.info("Wrong input");
            throw new RuntimeException();
        }
        return service;
    }

}
