package org.example;


import java.net.*;
import java.io.*;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Main {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet("http://httpbin.org/get");
            System.out.println("Executing request " + httpget.getRequestLine());

            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                System.out.println("Response Status: " + response.getStatusLine());
                String responseString = EntityUtils.toString(response.getEntity());
                System.out.println("Response Content: " + responseString);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }
}