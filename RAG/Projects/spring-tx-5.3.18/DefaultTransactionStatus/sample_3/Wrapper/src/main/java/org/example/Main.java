package org.example;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.SimpleTransactionStatus;

public class Main {

    public static void main(String[] args) throws TransactionException {

        // Create a new TransactionStatus instance
        TransactionStatus transactionStatus = new SimpleTransactionStatus();
        
        // Do something with the transactionStatus...
    }
}