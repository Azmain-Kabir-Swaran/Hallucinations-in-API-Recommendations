package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    public static void main(String[] args) {
        try {
            // Connect to the website
            String url = "http://example.com";
            Document doc = Jsoup.connect(url).get();

            // Access data using selectors
            String title = doc.title();
            System.out.println("Title : " + title);

            // Printing meta tags
            doc.getElementsByTag("meta").forEach(meta -> {
                if (meta.hasAttr("name")) {
                    System.out.println("Meta Tag : " + meta.attr("name"));
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}