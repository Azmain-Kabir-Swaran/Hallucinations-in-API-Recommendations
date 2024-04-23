package org.example;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class Main {
    private PlatformTransactionManager transactionManager;

    public Main(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void performTransaction() {
        TransactionStatus status = this.transactionManager.getTransaction(new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRES_NEW));
        try {
            // Your code here

            this.transactionManager.commit(status);
        } catch (RuntimeException e) {
            this.transactionManager.rollback(status);
            throw e;
        }
    }
}