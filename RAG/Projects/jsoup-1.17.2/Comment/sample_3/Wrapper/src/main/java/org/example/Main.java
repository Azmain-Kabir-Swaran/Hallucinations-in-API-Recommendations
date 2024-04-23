package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        String url = "http://website.com"; // put your URL here

        try {
            Document document = Jsoup.connect(url).get();

            Elements links = document.select("a[href]");
            for (Element link : links) {
                System.out.println("\nLink: " + link.attr("abs:href"));
                System.out.println("Text: " + link.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}