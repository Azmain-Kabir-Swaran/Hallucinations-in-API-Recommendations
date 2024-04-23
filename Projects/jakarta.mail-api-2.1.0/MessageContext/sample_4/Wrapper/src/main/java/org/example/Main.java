package org.example;


import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;

public class Main {

    public static void main(String[] args) throws AddressException {
        String email = "example@gmail.com";
        
        // The InternetAddress.validate method returns boolean.
        boolean isValid = InternetAddress.isValid(email);
        System.out.println("Is valid email: " + isValid);
        
        // If it's not valid, a AddressException will be thrown
        InternetAddress emailAddr = new InternetAddress(email);
        emailAddr.validate();
    }
}