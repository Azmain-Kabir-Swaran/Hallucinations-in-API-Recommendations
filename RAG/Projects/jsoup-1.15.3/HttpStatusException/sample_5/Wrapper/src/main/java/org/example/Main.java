package org.example;


import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // URL where you want to make the request
            String url = "https://www.example.com";
            
            // Connect to URL and retrieve data
            Document doc = Jsoup.connect(url)
                .timeout(5000) // Optional, it's a timeout in milliseconds
                .get();
            
            // Get some elements from the returned HTML
            Elements title = doc.select("title");
            Elements links = doc.select("a");
            
            // Print the selected elements
            for (Element link : links) {
                System.out.println(link);
            }
        } catch (HttpStatusException e) {
            System.err.println("Could not reach server or could not find what you were looking for");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}