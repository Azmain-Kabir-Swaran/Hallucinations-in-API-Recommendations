package org.example;


import freemarker.template.SimpleScalar;

public class Main {

    public static void main(String[] args) {
        try {
            SimpleScalar simpleScalar = new SimpleScalar("Hello, World!", "UTF-8");

            // The rest of the logic goes here.

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}