package org.example;


import com.alibaba.fastjson.JSONArray;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create a new JSONArray
        JSONArray array = new JSONArray();
        
        // Add some objects to the JSONArray
        array.add("element1");
        array.add("element2");
        array.add("element3");
        
        // Print the JSONArray
        System.out.println("JSONArray: " + array);
        
        // Convert the JSONArray to a List
        List<String> list = array.toJavaList(String.class);
        
        // Print the List
        System.out.println("List: " + list);
    }
}