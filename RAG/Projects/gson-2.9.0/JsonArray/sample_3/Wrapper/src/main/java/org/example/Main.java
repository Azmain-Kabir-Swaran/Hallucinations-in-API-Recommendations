package org.example;


import com.google.gson.JsonArray;
import com.googlegon.gson.JsonParser;
import java.io.FileReader;
import java.io.Reader;

public class Main {
   public static void main(String[] args) {
      try {
         Reader reader = new FileReader("jsonfile.json");
         
         JsonParser parser = new JsonParser();
         JsonArray array = (JsonArray) parser.parse(reader);
         
         for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
         }
         
         reader.close();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}