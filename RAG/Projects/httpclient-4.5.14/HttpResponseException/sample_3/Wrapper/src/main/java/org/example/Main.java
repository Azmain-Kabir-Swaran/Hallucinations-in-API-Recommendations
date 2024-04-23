package org.example;


import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://example.com");

        try {
            httpClient.execute(request);
        } catch (ClientProtocolException e) {
            throw new HttpResponseException(500, "Server Error: HTTP protocol violation");
        }
    }
}