package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // Use Jsoup to connect to a website. Here we are using "http://www.example.com" but you can replace it.
            Document document = Jsoup.connect("http://www.example.com").get();
            
            // Use the select() method to grab Elements. Here, we are going to grab a Elements with the class "example".
            Elements elements = document.select(".example");

            // Print each Elements using the forEach() method.
            elements.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}