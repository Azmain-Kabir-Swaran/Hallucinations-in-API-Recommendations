package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {

    public static void main(String[] args) {
        // Use the TransactionSynchronizationManager API
        boolean isCurrentTransactionReadOnly = TransactionSynchronizationManager.isCurrentTransactionReadOnly();
        System.out.println("Current transaction is read-only: " + isCurrentTransactionReadOnly);
    }
}