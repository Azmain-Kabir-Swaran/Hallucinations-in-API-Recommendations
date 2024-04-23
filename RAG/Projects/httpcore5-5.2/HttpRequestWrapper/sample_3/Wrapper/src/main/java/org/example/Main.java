package org.example;


import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost("http://example.com");

        try {
            StringEntity entity = new StringEntity("Sample Text");
            request.setEntity(entity);
            
            CloseableHttpResponse response = client.execute(request);
            try {
                System.out.println(response.getStatusLine());
                HttpEntity respEntity = response.getEntity();
                if (respEntity != null) {
                    System.out.println(EntityUtils.toString(respEntity));
                }
            } finally {
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}