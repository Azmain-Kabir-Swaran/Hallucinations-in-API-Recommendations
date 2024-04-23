package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String url = "url_here";

        try {
            Document doc = Jsoup.connect(url).get();

            // Getting DataNode API from Jsoup for more complex manipulation
            Elements elements = doc.select("tag_name"); // Use your tag here where you want to extract data

            // Printing extracted data
            for (Element element : elements) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}