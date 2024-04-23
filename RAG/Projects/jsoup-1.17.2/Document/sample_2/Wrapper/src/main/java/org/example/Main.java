package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String[] args) {
        try {
            //connect to the URL and fetch the page content
            Document document = Jsoup.connect("https://www.website.com").get();
            
            //select a tag
            Elements elements = document.select("tag");
            
            for (Element element : elements) {
                //print the text inside each selected element
                System.out.println(element.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}