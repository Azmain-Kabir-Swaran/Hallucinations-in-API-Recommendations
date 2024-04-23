package org.example;


import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("http://httpbin.org/get").get();
            System.out.println(doc.html());
        } catch (HttpStatusException e) {
            System.out.println("HttpStatusException: " + e.getStatusCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}