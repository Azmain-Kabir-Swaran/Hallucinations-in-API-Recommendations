package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://www.example.com";
        Document document = Jsoup.connect(url).get();
        Elements newsHeadlines = document.select("h2.story-heading");

        for (Element headline : newsHeadlines) {
            System.out.println(headline.text());
        }
    }
}