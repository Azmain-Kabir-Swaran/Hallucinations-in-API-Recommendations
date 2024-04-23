package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://example.com";
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            
            for(Element link: links){
                String linkHref = link.attr("href");
                System.out.println(linkHref);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}