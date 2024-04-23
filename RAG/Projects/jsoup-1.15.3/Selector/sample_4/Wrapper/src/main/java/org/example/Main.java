package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        String url = "http://example.com";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements p = doc.select("p"); // Selecting paragraphs
            for(int i = 0; i < p.size(); i++){
                System.out.println(p.get(i).text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}