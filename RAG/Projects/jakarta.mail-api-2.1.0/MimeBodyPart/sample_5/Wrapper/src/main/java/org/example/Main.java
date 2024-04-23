package org.example;


import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        // Set the host smtp server details
        String host = "smtp.host.com";
        final String from = "your@email.com";
        final String password = "your-password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(props, null);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new jakarta.mail.internet.InternetAddress(from));
            message.addRecipients(jakarta.mail.Message.RecipientType.TO, String.valueOf(new jakarta.mail.internet.InternetAddress("recipient@email.com")));

            message.setSubject("Test message");

            String msg = "Hello World!";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/html");

            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(mimeBodyPart);

            message.setContent(mimeMultipart);

            // Send the message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}