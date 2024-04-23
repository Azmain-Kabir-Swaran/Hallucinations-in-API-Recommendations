package org.example;


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

            CloseableHttpResponse response = null;
            try {
                response = httpclient.execute(httpget);

                System.out.println("----------------------------------------");
                System.out.println(response.getStatusLine());

                EntityUtils.consume(response.getEntity());
            } finally {
                if (response != null) {
                    response.close();
                }
            }
        } finally {
            httpclient.close();
        }
    }
}