package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // Connect to the web page
            Document document = Jsoup.connect("http://example.com").get();

            // Select the elements
            Elements elements = document.select("div");

            // Loop through the elements
            for (Element element : elements) {
                // Get the attribute value
                String attributeValue = element.attr("id");

                // Print the attribute value
                System.out.println(attributeValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}