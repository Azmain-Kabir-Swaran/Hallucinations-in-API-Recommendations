package org.example;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class Main {
    public static void main(String[] args) {

        // Create new HttpHeaders
        HttpHeaders headers = new HttpHeaders();

        // Add values to the headers
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("myHeader", "headerValue");

        // You can get values from the headers
        System.out.println("Content Type: " + headers.getContentType());
        System.out.println("myHeader: " + headers.getFirst("myHeader"));
    }
}