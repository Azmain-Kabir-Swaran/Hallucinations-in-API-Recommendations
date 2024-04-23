package org.example;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws IOException {
        // Connect to a URL and get the HTML Document
        Document doc = Jsoup.connect("http://www.example.com").get();

        // Select all div elements with a class of link
        Elements elements = doc.select("div.link");

        // Get the child node of the divs
        for (Element element : elements) {
            Elements childElements = element.getElementsByTag("a");
            for (Element childElement : childElements) {
                System.out.println(childElement.attr("href"));
            }
        }
    }
}