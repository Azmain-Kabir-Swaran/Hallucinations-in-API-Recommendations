package org.example;


import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {
   public static void main(String[] args) {

      // Recipient's email ID should be mentioned
      String to = "example@gmail.com";

      // Sender's email ID should be mentioned
      String from = "sender@gmail.com";

      // Sender's email password should be mentioned
      final String password = "password";

      // Assuming you are sending email through relay.jangosoft.com
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");

      // Get the Session object
      Session session = Session.getInstance(props, new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
         }
      });

      try {
         // Create a default MimeMessage object
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Now set the actual message
         message.setText("This is the actual message");

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
         e.printStackTrace();
      }
   }
}