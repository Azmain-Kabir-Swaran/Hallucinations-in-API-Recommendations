package org.example;


import org.springframework.transaction.interceptor.TransactionInterceptor;

public class Main {
    public static void main(String[] args) {
        TransactionInterceptor interceptor = new TransactionInterceptor();
        System.out.println("TransactionInterceptor is created successfully.");
    }
}