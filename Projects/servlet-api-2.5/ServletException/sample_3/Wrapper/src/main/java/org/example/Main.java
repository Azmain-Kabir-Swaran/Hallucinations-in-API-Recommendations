package org.example;


import javax.servlet.ServletException;

public class Main {
    public static void main(String[] args) throws ServletException {
        // Create an instance of ServletException and throw it
        throw new ServletException("Custom Exception Message");
    }
}