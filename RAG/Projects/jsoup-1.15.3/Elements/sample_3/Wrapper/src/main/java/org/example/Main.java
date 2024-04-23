package org.example;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
  public static void main(String[] args) throws Exception {
    String url = "https://www.imdb.com/chart/top";

    Document doc = Jsoup.connect(url).get();

    Elements movies = doc.select(".titleColumn a");

    for (Element movie : movies) {
      System.out.println(movie.text());
    }
  }
}