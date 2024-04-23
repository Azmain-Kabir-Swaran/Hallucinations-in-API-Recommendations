package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        // Connect to website
        Document doc = Jsoup.connect("https://www.example.com").get();

        // Get and print all comments
        Elements comments = doc.select("Comment");
        for (Element comment : comments) {
            System.out.println(comment.text());
        }
    }
}