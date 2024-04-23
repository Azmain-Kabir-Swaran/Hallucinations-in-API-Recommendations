package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "http://example.com";
            Document doc = Jsoup.connect(url).get();

            System.out.println("Title: " + doc.title());

            Elements links = doc.select("a");
            for (Element link : links) {
                System.out.println("\nLink: " + link.attr("href"));
                System.out.println("Text: " + link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}