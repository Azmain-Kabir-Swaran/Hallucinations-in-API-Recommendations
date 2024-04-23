package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Specify the URL you want to fetch
            String url = "https://www.your-url.com";

            // Fetch the webpage
            Document doc = Jsoup.connect(url).get();

            // Parse the fetched webpage and print the comments
            System.out.println(doc.getAllElements().select("script").text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}