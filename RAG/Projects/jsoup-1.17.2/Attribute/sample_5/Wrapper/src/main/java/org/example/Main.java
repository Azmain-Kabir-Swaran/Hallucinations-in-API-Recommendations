package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Attribute;

public class Main {
    public static void main(String[] args) {
        String html = "your html string";  // input your own html string here
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("elements");  // select your elements using selector, replace 'elements' with your own selector
        for (Element element : elements) {
            Attribute attribute = element.attribute("name");  // replace 'name' with the name of the attribute
            System.out.println(attribute.getKey() + " : " + attribute.getValue());
        }
    }
}