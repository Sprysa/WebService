package com.epam.lab.utills;

import com.epam.lab.model.Mail;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.input.BOMInputStream;

public class CSVMailManager {

  public static String[] HEADERS = {"Email", "Subject", "Body"};

  /**
   * Method is handel csv file encoding issue
   */
  private static InputStreamReader newReader(final InputStream inputStream) {
    return new InputStreamReader(new BOMInputStream(inputStream), StandardCharsets.UTF_8);
  }

  public static List<Mail> readMails(File file) {
    List<Mail> list = new ArrayList<>();
    InputStream in = null;
    try {
      in = new FileInputStream(file);
      Iterable<CSVRecord> parser = CSVFormat.DEFAULT.withHeader(HEADERS).withSkipHeaderRecord(true).parse(newReader(in));

      for (CSVRecord record : parser) {
        list.add(new Mail(record.get("Email"), record.get("Subject"), record.get("Body")));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        in.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return list;
  }

  public static void writeMails(List<Mail> mailList, File file) {
    Writer out = null;
    CSVPrinter csvFilePrinter = null;
    CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator("\n").withNullString("");

    try {
      out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

      csvFilePrinter = new CSVPrinter(out, csvFileFormat);

      csvFilePrinter.printRecord(HEADERS);

      for (Mail mail : mailList) {
        csvFilePrinter.printRecord(mail.getEmail(), mail.getSubj(), mail.getBody());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        out.flush();
        out.close();
        csvFilePrinter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
