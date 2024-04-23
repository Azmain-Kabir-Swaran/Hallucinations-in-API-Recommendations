package org.example;


import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

public class Main {

    public static void main(String[] args) throws Exception {
        HttpHost proxy = new HttpHost("localhost", 8080);
        HttpClient client = HttpClients.createDefault();

        System.out.println(client.getClass().getName()); // for verification purposes
    }
}