package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String[] args) {
        try {
            // Connect to the web page
            Document document = Jsoup.connect("https://www.your_website.com").get();
            
            // Get the body element
            Element body = document.body();

            // Get the first paragraph
            Element paragraph = body.select("p").first();

            // Print the text of the paragraph
            System.out.println(paragraph.text());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}