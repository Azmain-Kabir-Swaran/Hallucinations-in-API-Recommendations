package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String[] args) {
        String url = "https://example.com";
        try {
            Document doc = Jsoup.connect(url).get();
            Element title = doc.select("title").first();
            System.out.println("Page title: " + title.text());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}