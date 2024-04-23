package org.example;


import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class Main {
    public static void main(String[] args) {
        PlatformTransactionManager transactionManager = new AbstractPlatformTransactionManager() {
            @Override
            protected TransactionStatus doBegin(TransactionDefinition definition, Object transaction) {
                return null; // implement this according to your transaction manager
            }

            @Override
            protected void doCommit(DefaultTransactionStatus status) {
                // implement this according to your transaction manager
            }
        };

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus transaction = transactionManager.getTransaction(def);
        // do something here...
        transactionManager.commit(transaction);
    }
}