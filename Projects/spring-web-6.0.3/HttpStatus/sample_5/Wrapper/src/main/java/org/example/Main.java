package org.example;


import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

public class Main {

    public static void main(String[] args) {

        try {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Bad Request");
        } catch (ResponseStatusException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStatus());
        }
    }
}