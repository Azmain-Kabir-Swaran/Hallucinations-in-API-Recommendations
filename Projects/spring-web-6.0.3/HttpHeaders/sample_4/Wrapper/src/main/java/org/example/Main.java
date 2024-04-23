package org.example;


import org.springframework.http.HttpHeaders;
import org.springframework.util.MimeType;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        // Creating HttpHeaders instance
        HttpHeaders headers = new HttpHeaders();

        // Add a new header of type String
        headers.set("MyHeader", "HeaderValue");

        // Add a new header of type URI
        headers.setLocation(URI.create("http://www.example.com"));

        // Access the headers and values
        Map<String, String> headersMap = headers.toSingleValueMap();
        Iterator<String> iterator = headersMap.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ": " + headersMap.get(key));
        }
    }
}