package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String html = "<html><body><h1>Hello, World!</h1></body></html>";
            Document doc = Jsoup.parse(html);

            Elements elements = doc.select("h1");
            for (Element e : elements) {
                System.out.println(e.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}