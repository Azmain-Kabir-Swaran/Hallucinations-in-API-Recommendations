package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {

    public static void main(String[] args) {
        // Check if a transaction is currently active
        boolean isActive = TransactionSynchronizationManager.isActualTransactionActive();
        System.out.println("Is a transaction active? " + isActive);

        // Get the name of the current transaction or default to none
        String transactionName = TransactionSynchronizationManager.getCurrentTransactionName();
        System.out.println("Current Transaction Name: " + transactionName);
    }
}