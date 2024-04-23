package org.example;


import org.apache.http.HttpVersion;

public class Main {
    public static void main(String[] args) {
        // Use the HttpVersion API
        HttpVersion httpVersion = HttpVersion.HTTP_1_1;
        System.out.println("HTTP Version: " + httpVersion);
    }
}