package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.m/Wikipedia,_the_free_encyclopedia";

        Document doc = Jsoup.connect(url).get();

        Elements title = doc.select("title");

        System.out.println("Title: " + title.text());
    }
}