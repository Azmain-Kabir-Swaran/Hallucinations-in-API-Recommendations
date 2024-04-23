package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        // specify URL
        String url = "https://www.example.com";
        
        // connect to URL, send get request
        Document doc = Jsoup.connect(url).get();

        // specify the tag, tag attributes, etc., to search for
        Elements paragraphs = doc.select("p");
        
        // print the selected elements
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }
}