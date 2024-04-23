package org.example;


import jakarta.mail.MimeBodyPart;
import jakarta.mail.MimeMessage;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.Session;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class Main {

    public static void main(String[] args) {

        // The mail session object.
        Session session = Session.getDefaultInstance(System.getProperties());

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set the message sender
            message.setFrom(new InternetAddress("sender@domain.com"));

            // Set the message recipient
            message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("recipient@domain.com"));

            // Set the message subject
            message.setSubject("Hello");

            // First part of the message (the body)
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is message body");

            // Second part of the message (the attachment)
            MimeBodyPart attachPart = new MimeBodyPart();

            String filename = "file.txt";
            DataSource source = new FileDataSource(filename);

            attachPart.setDataHandler(new DataHandler(source));
            attachPart.setFileName(filename);

            // Create the multi-part and attach body and attachment
            javax.mail.Multipart multiPart = new javax.mail.internet.MimeMultipart();
            multiPart.addBodyPart(messageBodyPart);
            multiPart.addBodyPart(attachPart);

            // Set the multi-part as the email's content
            message.setContent(multiPart);

            // Send the message
            javax.mail.Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}