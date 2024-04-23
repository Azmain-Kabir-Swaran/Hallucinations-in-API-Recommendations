package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;

public class Main {

    public static void main(String[] args) {
        
        TransactionCallbackWithoutResult callback = new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                // Your logic here
            }
        };
        
        // This checks if there is an active transaction
        boolean isActiveTransaction = TransactionSynchronizationManager.isActualTransactionActive();
        
        System.out.println("Is an active transaction: " + isActiveTransaction);
        
        // This checks if there is a suspended transaction
        boolean isSuspendedTransaction = TransactionSynchronizationManager.isActualTransactionActive();
        
        System.out.println("Is a suspended transaction: " + isSuspendedTransaction);
    }
}