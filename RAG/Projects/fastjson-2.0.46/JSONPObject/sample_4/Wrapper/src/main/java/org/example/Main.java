package org.example;


import com.alibaba.fastjson.JSONPObject;

class Main {
    public static void main(String[] args) {
        JSONPObject jsonp = new JSONPObject("myJsonp", "{ \"name\": \"John\", \"age\":30, \"city\": \"New York\"}");
        System.out.println(jsonp.getJSONObject("myJsonp"));
    }
}