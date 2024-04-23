package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.annotation.Transactional;

public class Main {

    public static void main(String[] args) {
        System.out.println("Transaction Status - " + TransactionSynchronizationManager.isActualTransactionActive());
        System.out.println("Transaction Status (Read-Only) - " + TransactionSynchronizationManager.isCurrentTransactionReadOnly());
    }
}