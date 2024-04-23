package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "https://www.example.com";
            Document doc = Jsoup.connect(url).get();

            // Select elements from Document using element's class, id or tag names
            Elements elements = doc.select("div"); // Example - selecting all "div" elements

            // Using the first element from the selection
            Element firstElement = elements.get(0); 

            // Element's attributes
            String id = firstElement.id();
            String className = firstElement.className();
            String tagName = firstElement.tagName();

            System.out.println("Element's id: " + id);
            System.out.println("Element's class name: " + className);
            System.out.println("Element's tag name: " + tagName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}