package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://www.example.com";  //replace with your url
            Document doc = Jsoup.connect(url).get();

            // Get the title
            System.out.println("\nTitle: " + doc.title());

            // Get the links
            Elements links = doc.select("a[href]");
            System.out.println("\nLinks:");
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }

            // Get the images
            Elements media = doc.select("[src]");
            System.out.println("\nMedia:");
            for (Element src : media) {
                if (src.tagName().equals("img")) {
                    System.out.println(src.attr("abs:src"));
                }
                if (src.tagName().equals("source")) {
                    System.out.println(src.attr("abs:src"));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}