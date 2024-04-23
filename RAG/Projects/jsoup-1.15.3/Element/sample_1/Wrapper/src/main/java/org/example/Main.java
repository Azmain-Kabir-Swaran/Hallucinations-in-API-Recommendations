package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        String url = "http://example.com";

        try {
            Document doc = Jsoup.connect(url).get();

            //selecting all elements with class "class-name" in the HTML doc
            Elements elements = doc.select(".class-name");

            for(Element element : elements) {
                System.out.println(element.attr("abs:href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}