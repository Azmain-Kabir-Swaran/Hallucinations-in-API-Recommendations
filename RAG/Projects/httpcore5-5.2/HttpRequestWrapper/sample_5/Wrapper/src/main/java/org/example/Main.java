package org.example;


import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

public class Main {
    public static void main(String[] args) {
        try {
            HttpGet request = new HttpGet("http://example.com"); 
            HttpClients.createDefault().execute(request); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}