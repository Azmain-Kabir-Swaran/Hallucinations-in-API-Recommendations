package org.example;


import com.alibaba.fastjson2.JSONArray;

public class Main {
    public static void main(String[] args) {
        // Create a JSONArray
        JSONArray jsonArray = new JSONArray();

        // Add elements to the JSONArray
        jsonArray.add("Element 1");
        jsonArray.add("Element 2");
        jsonArray.add("Element 3");

        // Print the elements of the JSONArray
        for(int i=0;i<jsonArray.size();i++) {
            System.out.println(jsonArray.get(i));
        }
    }
}