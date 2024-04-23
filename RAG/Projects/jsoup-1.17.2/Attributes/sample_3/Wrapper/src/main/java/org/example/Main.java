package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "https://stackoverflow.com/questions/tagged/java";
            Document doc = Jsoup.connect(url).get();

            Elements questions = doc.getElementsByClass("question-hyperlink");

            for (Element question : questions) {
                System.out.println(question.text());
            }
        } catch (Exception e) {
            System.err.println("An error occurred.");
        }
    }
}