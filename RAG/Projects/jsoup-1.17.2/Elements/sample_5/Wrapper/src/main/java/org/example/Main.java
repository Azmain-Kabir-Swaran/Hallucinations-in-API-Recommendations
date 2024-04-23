package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("p");

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).text());
        }
    }
}