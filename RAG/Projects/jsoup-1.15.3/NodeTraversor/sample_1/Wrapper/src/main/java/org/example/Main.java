package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://your-website.com";
            Document document = Jsoup.connect(url).get();
            
            Elements links = document.select("a[href]");
            for (Element link : links) {
                String href = link.attr("href");
                System.out.println(href);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}