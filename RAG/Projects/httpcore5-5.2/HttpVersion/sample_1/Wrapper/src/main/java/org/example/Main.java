package org.example;


import org.apache.http.protocol.HTTP;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

public class Main {
    public static void main(String[] args) {
        ProtocolVersion http10 = HttpVersion.HTTP_1_0;
        ProtocolVersion http11 = HttpVersion.HTTP_1_1;

        System.out.println("HTTP 1.0: " + http10);
        System.out.println("HTTP 1.1: " + http11);
    }
}