package org.example;


import org.apache.http.HttpHost;
import org.apache.http.client.utils.URIBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        URIBuilder uriBuilder = new URIBuilder("http", "www.example.com", "/uri", "query=queryString");
        HttpHost httpHost = HttpHost.create(uriBuilder.toString());

        System.out.println(httpHost);
    }
}