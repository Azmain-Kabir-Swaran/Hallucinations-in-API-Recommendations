package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "http://your-target-url.com"; // replace this with your URL
            Document doc = Jsoup.connect(url).get();
            Elements newsHeadlines = doc.select("div.newsHeadlines"); // replace this with your HTML class/ID
            for (Element headline : newsHeadlines) {
                System.out.println(headline.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}