package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://www.example.com";
            Document document = Jsoup.connect(url).get();
            System.out.println(document.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}