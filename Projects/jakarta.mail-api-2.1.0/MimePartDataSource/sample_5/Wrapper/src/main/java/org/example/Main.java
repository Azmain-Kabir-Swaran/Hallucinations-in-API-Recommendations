package org.example;


import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimePartDataSource;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.activation.DataHandler;

public class Main {
    public static void main(String[] args) throws MessagingException {
        MimeMessage message = new MimeMessage();
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        MimePartDataSource source = new MimePartDataSource();
        mimeBodyPart.setDataHandler(new DataHandler(source));
    }
}