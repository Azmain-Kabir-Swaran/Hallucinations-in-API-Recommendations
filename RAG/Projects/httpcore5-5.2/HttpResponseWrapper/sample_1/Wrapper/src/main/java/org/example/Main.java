package org.example;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class Main {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        HttpPost httppost = new HttpPost(new URI("http://httpbin.org/post"));

        // Request parameters and other properties.
        List<NameValuePair> params = new ArrayList<NameValuePair>(2);
        params.add(new BasicNameValuePair("param1", "value1"));
        params.add(new BasicNameValuePair("param2", "value2"));
        httppost.setEntity(new UrlEncodedFormEntity(params));

        CloseableHttpResponse response = null;
        try {
            // Execute the request.
            response = httpclient.execute(httppost);

            System.out.println("Status line: " + response.getStatusLine());

        } finally {
            // Ensure response is closed after processing.
            response.close();
            httpclient.close();
        }
    }
}