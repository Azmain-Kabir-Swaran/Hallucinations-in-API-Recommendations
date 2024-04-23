package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // Connect to the website and parse the HTML.
            Document doc = Jsoup.connect("http://www.example.com").get();

            // Get all the paragraphs from the website.
            Elements paragraphs = doc.select("p");

            // For each paragraph, print its text content.
            for (Element paragraph : paragraphs) {
                System.out.println(paragraph.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}