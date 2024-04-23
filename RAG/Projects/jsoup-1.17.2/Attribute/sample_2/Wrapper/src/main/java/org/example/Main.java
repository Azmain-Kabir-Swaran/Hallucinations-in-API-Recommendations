package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Download web page from provided URL
            Document document = Jsoup.connect("http://example.com").get();

            // Get title
            String title = document.title();
            System.out.println("Title: " + title);

            // Get all links from the web page
            Elements links = document.select("a[href]");
            System.out.println("\nLinks:");
            for (Element link : links) {
                System.out.println("\t" + link.attr("abs:href"));
            }

            // Get all elements with 'example-class' class
            Elements elements = document.getElementsByClass("example-class");
            System.out.println("\nElements with 'example-class' class:");
            for (Element element : elements) {
                System.out.println("\t" + element.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}