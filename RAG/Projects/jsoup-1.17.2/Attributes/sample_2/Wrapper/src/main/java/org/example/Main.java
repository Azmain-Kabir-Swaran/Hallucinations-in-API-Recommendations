package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception {

        String url = "http://example.com";
        Document doc = Jsoup.connect(url).get();
        
        // Selects and iterates over all elements with a class of "class"
        Elements elementsWithClass = doc.getElementsByClass("class");
        for (Element element : elementsWithClass) {
            // Selects and iterates over all attributes
            for (org.jsoup.nodes.Attribute attribute : element.attributes()) {
                System.out.println("Attribute: " + attribute.getKey() + " = " + attribute.getValue());
            }
        }
    }
}