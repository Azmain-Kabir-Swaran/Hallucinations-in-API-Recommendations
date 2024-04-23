package org.example;


import jakarta.mail.*;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a mail session
            Properties properties = new Properties();
            Session session = Session.getDefaultInstance(properties);

            // Create a message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("sender@example.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("recipient@example.com"));
            message.setSubject("Test message");
            
            // Create a multipart message
            Multipart multipart = new MimeMultipart();

            // Create the text body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText("This is message body");

            // Attach the text body part
            multipart.addBodyPart(textBodyPart);

            // Create the attachment body part
            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile("/path/to/your/attachment");

            // Attach the attachment body part
            multipart.addBodyPart(attachmentBodyPart);

            // Set the multipart as the message's content
            message.setContent(multipart);

            // Create a transport
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.example.com", 25, "sender@example.com", "password");

            // Send the message
            transport.sendMessage(message, message.getAllRecipients());

            // Close the transport
            transport.close();

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}