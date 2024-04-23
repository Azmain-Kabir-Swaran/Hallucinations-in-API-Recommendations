package org.example;


import jakarta.mail.BodyPart;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;

public class Main {
    public static void main(String[] args) {
        // Create a session object
        Session session = Session.getDefaultInstance(System.getProperties());

        // Create a new mail message
        MimeMessage message = new MimeMessage(session);

        try {
            // Create a multipart message
            MimeMultipart multipart = new MimeMultipart();

            // Create a text body part
            BodyPart textBodyPart = new MimeBodyPart();

            // Fill the text body part with some text
            String text = "This is a text body.";
            textBodyPart.setText(text);

            // Add the text body part to the multipart
            multipart.addBodyPart(textBodyPart);

            // Set the whole message content to be the multipart content
            message.setContent(multipart);

            // Other operations may follow as needed...

        } catch (MessagingException ex) {
            // Do something with the exception
            ex.printStackTrace();
        }
    }
}