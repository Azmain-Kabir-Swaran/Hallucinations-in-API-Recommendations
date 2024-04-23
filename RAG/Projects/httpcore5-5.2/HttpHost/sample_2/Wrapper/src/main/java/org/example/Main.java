package org.example;


import org.apache.http.HttpHost;

public class Main {
    public static void main(String[] args) {
        HttpHost proxy = new HttpHost("proxy.com", 8080);
        // Use the HttpHost object proxy in your HttpClient or HttpClientBuilder for example.
    }
}