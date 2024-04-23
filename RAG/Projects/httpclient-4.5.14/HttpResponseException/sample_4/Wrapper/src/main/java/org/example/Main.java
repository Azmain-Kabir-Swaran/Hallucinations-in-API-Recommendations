package org.example;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Main {

    public static void main(String[] args) throws Exception {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.com/");
        request.addHeader("User-Agent", "Mozilla/5.0");
        CloseableHttpResponse response = httpClient.execute(request);

        try {
            System.out.println("Response Status: " + response.getStatusLine().getStatusCode());
        } finally {
            response.close();
        }
    }
}