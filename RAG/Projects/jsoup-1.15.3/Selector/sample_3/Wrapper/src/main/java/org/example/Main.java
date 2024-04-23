package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String url = "http://www.example.com"; // Replace with the URL you want to parse

        try {
            Document doc = Jsoup.connect(url).get();
            // This will select the HTML elements with the class of "example"
            Elements elements = doc.select(".example");

            // Loop through the selected elements
            for (org.jsoup.nodes.Element element : elements) {
                System.out.println(element.text()); // Print the text of the HTML element
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}