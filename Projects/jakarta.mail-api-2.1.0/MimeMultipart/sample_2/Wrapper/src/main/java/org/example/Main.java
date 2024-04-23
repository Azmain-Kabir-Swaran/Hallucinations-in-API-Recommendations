package org.example;


import jakarta.mail.*;
import jakarta.mail.internet.*;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.internet.MimeBodyPart;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("yourEmail", "yourPassword");
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("fromEmail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("toEmail"));
            message.setSubject("Testing Subject");

            String msg = "This is my first email using JavaMail API";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html; charset=UTF-8");

            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Mail Sent successfully");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}