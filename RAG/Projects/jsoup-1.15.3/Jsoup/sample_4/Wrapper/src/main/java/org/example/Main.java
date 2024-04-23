package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        String url = "https://www.example.com"; // Replace this with the URL you want to scrape
        try {
            Document document = Jsoup.connect(url).get();
            String title = document.title();

            System.out.println("Title: " + title);

            Elements links = document.select("a");
            System.out.println("\nLinks:");

            for (Element link : links) {
                String linkText = link.text();
                String href = link.attr("abs:href");

                if (!linkText.isEmpty() && !href.isEmpty()) {
                    System.out.println(linkText + " -> " + href);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}