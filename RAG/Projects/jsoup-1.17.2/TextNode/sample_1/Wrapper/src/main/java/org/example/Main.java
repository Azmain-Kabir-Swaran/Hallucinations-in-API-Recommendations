package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String url = "http://example.com";
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
            Elements paragraphs = doc.select("p");
            for (Element paragraph : paragraphs) {
                for (TextNode node : paragraph.textNodes()) {
                    String text = node.getWholeText();
                    System.out.println(text);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}