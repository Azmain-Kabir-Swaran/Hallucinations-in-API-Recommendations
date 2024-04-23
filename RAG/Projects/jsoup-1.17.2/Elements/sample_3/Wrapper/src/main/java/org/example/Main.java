package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            // Get the Document object by connecting to the URL
            Document doc = Jsoup.connect("https://example.com").get();

            // Select Elements from Document
            Elements elements = doc.select("div");

            for (Element element : elements) {
                // Extract and print the text inside each div element
                System.out.println(element.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}