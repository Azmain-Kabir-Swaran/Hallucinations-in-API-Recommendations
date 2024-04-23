package org.example;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Main {
    public static void main(String[] args) {
        // Use the HttpStatus API
        HttpStatus httpStatus = HttpStatus.OK;

        // Use the ResponseEntity API
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Response body", httpStatus);

        System.out.println("Status code: " + responseEntity.getStatusCode());
        System.out.println("Body: " + responseEntity.getBody());
    }
}