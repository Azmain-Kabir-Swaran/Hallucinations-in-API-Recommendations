package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://www.example.com";
            Document document = Jsoup.connect(url).get();
            
            // Select attribute
            Elements elements = document.select("div");
            for (Element element : elements) {
                String attrValue = element.attr("class");
                System.out.println("Attribute Value: " + attrValue);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}