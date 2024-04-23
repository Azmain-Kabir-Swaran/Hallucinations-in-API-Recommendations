package org.example;


import org.eclipse.jetty.server.HttpOutput;
import org.eclipse.jetty.server.Response;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new HttpOutput object
            HttpOutput out = new HttpOutput(/* your HttpOutput parameters here */);
            
            // Use the HttpOutput object for writing response
            String response = "Hello, World!";
            out.write(response.getBytes());
            
            // Flush the response
            Response.Flusher flusher = new Response.Flusher();
            flusher.flush(out);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}