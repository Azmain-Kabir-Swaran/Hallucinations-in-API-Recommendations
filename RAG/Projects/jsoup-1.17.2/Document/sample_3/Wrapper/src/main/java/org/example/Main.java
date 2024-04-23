package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        String html = "<html><head><title>A Test Page</title></head><body><p>An example paragraph</p></body></html>";
        
        Document doc = Jsoup.parse(html);

        System.out.println("\n\nTitle : " + doc.title());

        Elements links = doc.select("p");
        System.out.println("\n\nParagraph : " + links.text());
    }
}