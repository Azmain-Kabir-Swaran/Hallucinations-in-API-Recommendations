package org.example;


import com.alibaba.fastjson.JSON;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class Main {
    public static void main(String[] args) {
        String json = "{\"store\":{\"book\":[\"apple\",\"pen\"]}}";

        DocumentContext context = JsonPath.parse(json);
        String book = context.read("$.store.book");
        System.out.println(book); // Output: ["apple","pen"]
    }
}