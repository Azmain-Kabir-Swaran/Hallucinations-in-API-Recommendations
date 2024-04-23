package org.example;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class Main {

    private TransactionTemplate transactionTemplate; // Assuming you have a TransactionTemplate configured elsewhere

    public void performOperationInTransaction() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                // Your business logic goes here.
            }
        });
    }
}