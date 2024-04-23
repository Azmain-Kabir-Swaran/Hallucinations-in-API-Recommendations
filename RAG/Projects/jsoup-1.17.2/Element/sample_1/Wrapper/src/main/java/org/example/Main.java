package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://www.yoururl.com"; // URL from where you want to fetch
            Document doc = Jsoup.connect(url).get();

            Elements elements = doc.select("p"); // Example of selecting paragraph
            for (Element el : elements) {
                System.out.println(el.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}