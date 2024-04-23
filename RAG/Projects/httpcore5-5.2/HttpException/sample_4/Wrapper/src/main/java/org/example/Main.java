package org.example;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {

    public static void main(String[] args) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(new HttpGet("http://www.google.com"))) {
            System.out.println(response.getStatusLine());
            HttpEntity entity = response.getEntity();
            System.out.println("Response Body: " + EntityUtils.toString(entity));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}