package org.example;


import org.slf4j.MDC;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            // Set the user key in the MDC context to "user1"
            MDC.put("user", "user1");

            // Retrieve and print the value of the "user" key in the MDC context
            String user = MDC.get("user");
            System.out.println("Value of the user key in the MDC context: " + user);

            // Clear the MDC
            MDC.clear();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            MDC.remove("user");
        }
    }
}