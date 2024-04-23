package org.example;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class Main {

    public static void main(String[] args) {
        // create HttpHeaders object
        HttpHeaders headers = new HttpHeaders();

        // add MediaType in header
        headers.setContentType(MediaType.APPLICATION_JSON);

        // print HttpHeaders
        System.out.println(headers.toString());
    }
}