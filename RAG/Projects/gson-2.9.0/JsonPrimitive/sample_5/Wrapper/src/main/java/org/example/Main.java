package org.example;


import com.google.gson.JsonPrimitive;

public class Main {
  public static void main(String[] args) {
    JsonPrimitive primitive = new JsonPrimitive(1);
    System.out.println(primitive);
  }
}