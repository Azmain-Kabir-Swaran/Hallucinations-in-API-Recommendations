package org.example;


import org.apache.http.HttpHost;

public class Main {
    public static void main(String[] args) {
        // Creating HttpHost object
        HttpHost proxy = new HttpHost("proxy.example.com", 8080);

        // Printing proxy host and port
        System.out.println("Proxy Host: " + proxy.getHostName());
        System.out.println("Proxy Port: " + proxy.getPort());
    }
}