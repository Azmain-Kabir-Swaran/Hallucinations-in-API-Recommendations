package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String[] args) {
        String html = "<html><body><p>Hello World</p></body></html>";
        Document doc = Jsoup.parse(html);
        for (Element paragraph : doc.select("p")) {
            String attribute = paragraph.attr("AttributeName");  // replace 'AttributeName' with the actual attribute name
            if (!attribute.isEmpty()) {
                System.out.println(attribute);
                break;
            }
        }
    }
}