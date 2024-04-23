package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Document doc;
        try {
            // Connect to the website
            doc = Jsoup.connect("http://example.com").get();
            // Select elements
            Elements newsHeadlines = doc.select("h2");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}