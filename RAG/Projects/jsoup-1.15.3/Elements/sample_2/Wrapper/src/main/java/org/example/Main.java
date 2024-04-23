package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        
        try {
            String url = "https://example.com"; // enter your URL here
            Document doc = Jsoup.connect(url).get();
            Elements elements = doc.select("elements"); // replace "elements" with the CSS query you need
            for(Element element : elements){
                System.out.println(element.text()); // fetch and print the text inside HTML element
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}