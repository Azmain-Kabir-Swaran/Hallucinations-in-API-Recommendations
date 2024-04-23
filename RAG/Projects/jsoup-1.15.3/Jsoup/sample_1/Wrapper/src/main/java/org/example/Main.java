package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

        try {
            // Connect to website and get its HTML
            Document document = Jsoup.connect("https://www.example.com").get();

            // Print the HTML of the page
            System.out.println(document);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}