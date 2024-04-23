package org.example;


import org.springframework.web.util.UriComponentsBuilder;

public class Main {

    public static void main(String[] args) {
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl("http://localhost")
                .scheme("https").port(443).path("/test");
        
        System.out.println(uriComponentsBuilder.toUriString());
    }

}