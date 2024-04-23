package org.example;


import org.springframework.http.HttpMethod;

public class Main {

    public static void main(String[] args) {
        HttpMethod httpMethod = HttpMethod.GET;
        System.out.println("HTTP method: " + httpMethod);
    }
}