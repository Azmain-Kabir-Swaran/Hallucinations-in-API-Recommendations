package org.example;


import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet("https://httpbin.org/get");

            try (CloseableHttpResponse response = client.execute(httpGet)) {
                System.out.println("Status code: " + response.getCode());
                System.out.println("Headers: " + response.getHeaders());
                System.out.println("Body: " + response.getEntity().getContent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}