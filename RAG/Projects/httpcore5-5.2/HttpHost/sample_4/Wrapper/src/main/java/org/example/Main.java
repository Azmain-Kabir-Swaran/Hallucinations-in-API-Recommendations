package org.example;


import org.apache.http.HttpHost;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.example.com");
            HttpHost proxy = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
            
            // Here you can perform HTTP operations using the proxy
            System.out.println("Proxy created: " + proxy);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}