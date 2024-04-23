package org.example;


import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;

public class Main {
    public static void main(String[] args) {
        try {
            URIBuilder builder = new URIBuilder("http://www.example.com");
            builder.setParameter("param1", "value1");
            
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(builder.build());
            
            HttpHost target = new HttpHost("www.example.com", 8080, "http");
            
            HttpResponse response = client.execute(target, request);
            
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                throw new HttpResponseException(response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase());
            }
            
            System.out.println("Response status line: " + response.getStatusLine());
            System.out.println("Response headers: " + response.getAllHeaders());
            System.out.println("Response body: " + EntityUtils.toString(response.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (HttpResponseException e) {
            e.printStackTrace();
        }
    }
}