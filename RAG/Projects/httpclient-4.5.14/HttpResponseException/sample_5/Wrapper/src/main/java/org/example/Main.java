package org.example;


import java.io.IOException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Main {
    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            try {
                HttpGet request = new HttpGet("http://www.example.com/");
                try (CloseableHttpResponse response = httpClient.execute(request)) {
                    // do something with response
                }
            } finally {
                httpClient.close();
            }
        } catch (IOException ex) {
            // handle exceptions
        }
    }
}