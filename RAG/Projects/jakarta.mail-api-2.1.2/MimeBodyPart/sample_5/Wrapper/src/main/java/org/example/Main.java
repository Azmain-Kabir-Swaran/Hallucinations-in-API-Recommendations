package org.example;


import jakarta.mail.BodyPart;
import jakarta.mail.MimeBodyPart;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.util.ByteArrayDataSource;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a MimeMultipart message
        MimeMultipart multipart = new MimeMultipart();

        // Create the first message part
        BodyPart messagePart = new MimeBodyPart();
        
        String text = "This is the text to be placed in the message";
        messagePart.setText(text);

        // Add the message part to the multipart
        multipart.addBodyPart(messagePart);

        // Now add the first part into a new part
        MimeBodyPart messagePart2 = new MimeBodyPart();
        
        ByteArrayDataSource ds = new ByteArrayDataSource("test.txt", "application/octet-stream");
        messagePart2.setDataHandler(new javax.activation.DataHandler(ds));

        // Add the message part2 into multipart
        multipart.addBodyPart(messagePart2);
    }
}