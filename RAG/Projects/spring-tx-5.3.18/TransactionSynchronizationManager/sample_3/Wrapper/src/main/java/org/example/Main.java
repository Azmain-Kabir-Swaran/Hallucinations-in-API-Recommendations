package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {
    public static void main(String[] args) {
        // Check if there's an existing transaction
        boolean isInTransaction = TransactionSynchronizationManager.isActualTransactionActive();
        System.out.println("Current transaction: " + (isInTransaction ? "Yes" : "No"));
        
        // Get the current transaction status
        int status = TransactionSynchronizationManager.getCurrentTransactionStatus();
        System.out.println("Current transaction status: " + status);
    }
}