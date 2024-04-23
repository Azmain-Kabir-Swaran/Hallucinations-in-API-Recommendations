package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // specify the URL you want to parse
            String url = "https://jsoup.org";

            // use jsoup to connect to the URL
            Document document = Jsoup.connect(url).get();

            // select Elements by id
            Element elementById = document.getElementById("footer");

            // select Elements by tag
            Elements elementsByTag = document.select("div");

            // select Elements by css query
            Elements elementsByCss = document.select("body > table");

            // select Elements by text
            Elements elementsByText = document.select("body");

            // print selected elements
            System.out.println("Element by id: " + elementById);
            System.out.println("Elements by tag: " + elementsByTag);
            System.out.println("Elements by css: " + elementsByCss);
            System.out.println("Elements by text: " + elementsByText);

        } catch (IOException e) {
            System.err.println("For URL: " + url + " failed or not found");
        }
    }
}