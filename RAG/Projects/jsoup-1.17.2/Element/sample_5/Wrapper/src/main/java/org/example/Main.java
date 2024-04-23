package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Provide your URL here.
        String url = "http://example.com";
        
        // Connect to the URL and get the HTML document.
        Document document = Jsoup.connect(url).get();
        
        // Select the body element from the HTML document.
        Element body = document.body();

        // Select all elements from the body element.
        Elements elements = body.getAllElements();
        
        // Iterate over the selected elements and print their tag names and text.
        for(Element element : elements) {
            System.out.println("Tag name: " + element.tagName() + ", Text: " + element.text());
        }
    }
}