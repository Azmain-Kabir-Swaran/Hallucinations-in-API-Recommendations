package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://example.com"; // change it with the url you want

            // Jsoup connect to the website and get the HTML document
            Document document = Jsoup.connect(url).get();

            // Get the HTML elements inside "a" tag which usually have links
            Elements links = document.select("a[href]");

            // Print each link
            for (Element link : links) {
                System.out.println("\nLink : " + link.attr("abs:href"));
                System.outtext : " + link.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}