package org.example;


import jakarta.mail.BodyPart;
import jakarta.mail.MimeMultipart;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // Creating a MimeBodyPart object
        MimeBodyPart messageBodyPart = new MimeBodyPart();

        // Specifying the MimeBodyPart as being a plain text part
        messageBodyPart.setText("This is message body");

        // Creating a Multipart object to hold the part objects
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

        // Setting up the Multipart into the message
        MimeMessage message = new MimeMessage(session);
        message.setContent(multipart);
    }
}