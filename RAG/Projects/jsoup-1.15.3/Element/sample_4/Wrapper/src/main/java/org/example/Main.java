package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Elements elements = doc.select("a[href]");
        elements.forEach(element -> {
            String link = element.attr("abs:href");
            String text = element.text();
            System.out.println("Link: " + link + ", Text: " + text);
        });
    }
}