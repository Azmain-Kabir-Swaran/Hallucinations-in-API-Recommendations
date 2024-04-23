package org.example;


import com.google.gson.stream.JsonWriter;
import java.io.StringWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    StringWriter writer = new StringWriter();
    JsonWriter jsonWriter = new JsonWriter(writer);
    jsonWriter.beginObject();
    jsonWriter.name("field");
    jsonWriter.value("value");
    jsonWriter.endObject();
    jsonWriter.close();
    System.out.println(writer.toString());
  }
}