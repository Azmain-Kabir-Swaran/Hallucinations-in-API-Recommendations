package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "http://example.com";
            Document doc = Jsoup.connect(url).get();
            Elements newsHeadlines = doc.select("h2.story-heading");
            
            for(Element headline: newsHeadlines){
                System.out.println(headline.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}