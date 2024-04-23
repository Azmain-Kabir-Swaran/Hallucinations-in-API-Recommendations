package org.example;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            // Specify URL to be scraped
            String url = "http://example.com";
            // Establish the connection and get the document
            Document doc = Jsoup.connect(url).get();
            
            // Use JSoup to fetch all links present in the webpage
            Elements links = doc.select("a");
            
            // Print all the links found
            for (Element link : links) {
                String linkText = link.attr("href");
                System.out.println(linkText);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}