package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "http://example.com";  // replace this with your url

        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("p");

        for (Element element : elements) {
            System.out.println(element.text());
        }
    }
}