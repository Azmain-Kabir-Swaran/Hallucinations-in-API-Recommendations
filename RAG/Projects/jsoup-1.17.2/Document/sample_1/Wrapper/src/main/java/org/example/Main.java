package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Connects to the webpage and downloads the HTML
            Document document = Jsoup.connect("https://example.com").get();

            // Selects all the links
            Elements links = document.select("a[href]");

            // Prints out each link
            for (Element link : links) {
                System.out.println("\nLink : " + link.attr("abs:href"));
                System.outout("\nText : " + link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}