package org.example;


import org.apache.hc.core5.http.HttpVersion;

public class Main {
    public static void main(String[] args) {
        HttpVersion httpVersion = HttpVersion.HTTP_1_1;
        System.out.println("HTTP Version: " + httpVersion);
    }
}