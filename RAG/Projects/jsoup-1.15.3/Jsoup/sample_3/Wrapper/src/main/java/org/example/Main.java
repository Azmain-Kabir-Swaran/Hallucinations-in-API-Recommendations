package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.example.com"; // change this to your website URL
        try {
            Document doc = Jsoup.connect(url).get();
            
            // Here we are going to find all the HTML elements with a class "sample-class"
            // then we will print the text of these elements
            Elements elementsWithClass = doc.getElementsByClass("sample-class");
            for (Element element : elementsWithClass) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}