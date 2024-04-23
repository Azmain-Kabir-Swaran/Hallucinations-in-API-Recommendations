package org.example;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.json.*;

public class Main {
    public static void main(String[] args) {

        JSONArray array = new JSONArray();

        // Adding elements to JSONArray
        array.add("Element1");
        array.add("Element2");
        array.add("Element3");

        // Getting JSONArray size
        int size = array.size();
        System.out.println("Size of the JSONArray is: " + size);

        // Printing the JSONArray contents
        System.out.println(array);

        // Adding elements to a specific index in the JSONArray
        array.add(1, "New Element");

        // Printing the JSONArray contents after the addition
        System.out.println(array);
    }
}