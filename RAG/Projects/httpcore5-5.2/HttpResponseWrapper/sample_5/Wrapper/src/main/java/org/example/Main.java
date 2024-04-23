package org.example;


import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

public class Main {
    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("http://example.com");
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                // handle response
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}