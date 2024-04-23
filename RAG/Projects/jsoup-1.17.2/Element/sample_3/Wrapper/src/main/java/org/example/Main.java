package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String url = "http://example.com";
        Document document = Jsoup.parse(url);

        // This example selects all elements with the class 'class-name'
        Elements elements = document.select(".class-name");
        
        // You can iterate over each Element and process it
        for (Element element : elements) {
            String text = element.text();
            System.out.println(text);
        }
    }
}