package org.example;


import jakarta.mail.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeBodyPart;

public class Main {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        InternetAddress toAddresses = new InternetAddress();
        toAddresses.setAddress("your_email@gmail.com");

        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, toAddresses);
        message.setSubject("Hello, this is a subject");

        Multipart multipart = new MimeMultipart();

        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("This is the message");
        multipart.addBodyPart(messageBodyPart);

        messageBodyPart = new MimeBodyPart();
        String file = "path_to_your_file.txt";
        messageBodyPart.attachFile(file);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);
        Transport.send(message);
    }
}