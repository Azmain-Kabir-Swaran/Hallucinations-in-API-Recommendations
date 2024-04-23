package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is current transaction synchronization active? " 
                    + TransactionSynchronizationManager.isSynchronizationActive());

        TransactionSynchronizationManager.bindResource(new Object(), "myResource");
        System.out.println("Bound myResource? " 
                    + TransactionSynchronizationManager.isResourceSynchronizationActive(new Object()));

        TransactionSynchronizationManager.unbindResource(new Object());
        System.out.println("Unbound myResource? " 
                    + !TransactionSynchronizationManager.isResourceSynchronizationActive(new Object()));

        TransactionSynchronizationManager.clearSynchronization();
        System.out.println("Cleared synchronization? " 
                    + !TransactionSynchronizationManager.isSynchronizationActive());
    }
}