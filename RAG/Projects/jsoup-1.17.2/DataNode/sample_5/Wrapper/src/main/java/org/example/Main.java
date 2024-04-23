package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://example.com";
        try {
            Document doc = Jsoup.connect(url).get();
            System.out.println(doc.html());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}