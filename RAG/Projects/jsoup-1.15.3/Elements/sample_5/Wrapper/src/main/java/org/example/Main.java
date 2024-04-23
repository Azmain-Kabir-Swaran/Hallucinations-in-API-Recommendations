package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            // parse the html from a url
            Document doc = Jsoup.connect("http://www.example.com").get();
            
            // get all the elements with the class "class_name"
            Elements elements = doc.getElementsByClass("class_name");
            
            // loop over elements and print out the text of each one
            for (Element element : elements) {
                System.out.println(element.text());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}