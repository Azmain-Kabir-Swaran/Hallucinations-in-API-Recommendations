package org.example;


import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import javax.mail.MessageContext;

public class Main {
    public static void main(String[] args) throws MessagingException {
        Message message = new MimeMessage(null);
        MessageContext context = message.getMimeMessageContext();

        // Here you can add code using `context` 
    }
}