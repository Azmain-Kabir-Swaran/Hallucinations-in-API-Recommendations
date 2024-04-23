package org.example;


import org.springframework.web.util.UriComponentsBuilder;

public class Main {
    public static void main(String[] args) {
        String uri = UriComponentsBuilder
            .fromPath("/example")
            .queryParam("param1", "value1")
            .queryParam("param2", "value2")
            .build()
            .toString();

        System.out.println("Built URI: " + uri);
    }
}