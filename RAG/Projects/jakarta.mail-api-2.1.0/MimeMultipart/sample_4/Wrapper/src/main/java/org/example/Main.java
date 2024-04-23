package org.example;


import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.user", "username");
        properties.setProperty("mail.password", "password");

        Session session = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom("user@gmail.com");
            message.addRecipients(Message.RecipientType.TO, "recipient@gmail.com");
            message.setSubject("Test email");

            MimeMultipart multiPart = new MimeMultipart();
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is message body");
            multiPart.addBodyPart(messageBodyPart);

            message.setContent(multiPart);

            jakarta.mail.Transport.send(message);
            System.out.println("Sent success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}