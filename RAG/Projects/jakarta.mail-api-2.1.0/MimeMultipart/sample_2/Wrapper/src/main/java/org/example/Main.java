package org.example;


import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String recipient = "recipient@mail.com"; // recipient email id 
        String msgBody = "This is a test mail";  // message body

        // Create a properties object for the session 
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true"); // enables SMTP authentication
        props.put("mail.smtp.starttls.enable", "true"); // starts TLS for network security
        props.put("mail.smtp.host", "smtp.gmail.com"); // for gmail's smtp
        props.put("mail.smtp.port", "587");

        // Create a Session object
        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("sender@gmail.com", "password"); // sender's email id and password
            }
        });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("sender@gmail.com")); // same as sender's email id

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient)); 
            // Send message
            message.setSubject("Mail Subject");
            message.setText(msgBody);

            Transport.send(message);

            System.out.println("Mail Sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}