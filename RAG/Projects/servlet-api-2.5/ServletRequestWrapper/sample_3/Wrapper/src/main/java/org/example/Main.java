package org.example;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.httpServletRequestWrapper;

public class Main {
    public static void main(String[] args) {
        HttpServletRequest request = new HttpServletRequestWrapper(){};
        String host = request.getRemoteHost();
        System.out.println("Remote Host: " + host);
    }
}