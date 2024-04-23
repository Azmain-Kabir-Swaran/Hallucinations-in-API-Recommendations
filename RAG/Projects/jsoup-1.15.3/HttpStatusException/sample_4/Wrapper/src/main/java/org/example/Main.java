package org.example;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "http://www.example.com";
            Connection connection = Jsoup.connect(url);
            Document document = connection.get();

            if (connection.response().statusCode() != 200) {
                throw new HttpStatusException("HTTP request returned with status: "
                        + connection.response().statusCode() + " for URL: " + url);
            }
            
            System.out.println(document.title()); // prints "Example Domain"

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}