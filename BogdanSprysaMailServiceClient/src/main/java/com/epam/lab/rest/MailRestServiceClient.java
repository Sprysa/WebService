package com.epam.lab.rest;

import com.epam.lab.Mail;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class MailRestServiceClient implements MailService {

  public Logger LOGGER = Logger.getLogger(MailRestServiceClient.class);
  public static final String BASE_ADDRESS = "http://localhost:8080/BogdanSprysaMailService/mailREST";
  private ClientConfig clientConfig;
  private Client client;

  public MailRestServiceClient() {
    clientConfig = new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    clientConfig = new DefaultClientConfig();
    client = Client.create(clientConfig);
  }

  public boolean sendMail(Mail mail) {
    LOGGER.info("sendMail method");
    ObjectMapper mapper = new ObjectMapper();
    String uri = BASE_ADDRESS + "/mail";
    LOGGER.info("path:" + uri);
    WebResource webResource = client.resource(uri);
    ClientResponse response = null;
    try {
      response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
          .post(ClientResponse.class, mapper.writeValueAsString(mail));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return true;
  }

  public List<Mail> getAllMails() {
    LOGGER.info("getAllMails method");
    ObjectMapper mapper = new ObjectMapper();
    String uri = BASE_ADDRESS + "/mails";
    LOGGER.info("path:" + uri);
    WebResource webResource = client.resource(uri);
    ClientResponse response = webResource.accept("application/json;encoding=UTF-8").get(ClientResponse.class);
    String mailsJson = response.getEntity(String.class);
    List<Mail> list = null;
    try {
      list = mapper.readValue(mailsJson, new TypeReference<List<Mail>>() {});
    } catch (IOException e) {
      e.printStackTrace();
    }
    return list;
  }

  public boolean deleteMail(Mail mail) {
    LOGGER.info("deleteMail method");
    ObjectMapper mapper = new ObjectMapper();
    String uri = BASE_ADDRESS + "/mail";
    LOGGER.info("path:" + uri);
    WebResource webResource = client.resource(uri);
    try {
    ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
        .delete(ClientResponse.class, mail);
    } catch (Exception e) {
//      e.printStackTrace();
    }
    return true;
  }

  public List<Mail> getMailsByEmail(String email) {
    LOGGER.info("getMailsByEmail method");
    ObjectMapper mapper = new ObjectMapper();
    String uri = BASE_ADDRESS + "/mails/" + email;
    LOGGER.info("path:" + uri);
    WebResource webResource = client.resource(uri);
    ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
        .get(ClientResponse.class);
    List<Mail> list = null;
    list = checkMail(mapper, response, list);
    return list;
  }

  public List<Mail> getMailsBySubject(String subj) {
    LOGGER.info("getMailsBySubject method");
    ObjectMapper mapper = new ObjectMapper();
    String uri = BASE_ADDRESS + "/mails/" + subj;
    LOGGER.info("path:" + uri);
    WebResource webResource = client.resource(uri);
    ClientResponse response = webResource.accept("application/json;encoding=UTF-8").type("application/json")
        .get(ClientResponse.class);
    List<Mail> list = null;
    list = checkMail(mapper, response, list);
    return list;
  }

  private List<Mail> checkMail(ObjectMapper mapper, ClientResponse response, List<Mail> list) {
    if (response.getStatus() != 200) {
      LOGGER.info("Such mails not exist");
    } else {
      String jsonMails = response.getEntity(String.class);
      try {
        list = mapper.readValue(jsonMails, new TypeReference<List<Mail>>() {
        });
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return list;
  }
}
