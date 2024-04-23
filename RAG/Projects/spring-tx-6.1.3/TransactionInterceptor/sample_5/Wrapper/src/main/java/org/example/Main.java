package org.example;


import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionInterceptor;

public class Main {
    public static void main(String[] args) {
        PlatformTransactionManager platformTransactionManager = new PlatformTransactionManager() {
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                return null;
            }

            public void commit(TransactionStatus status) throws TransactionException {

            }

            public void rollback(TransactionStatus status) throws TransactionException {

            }
        };

        TransactionInterceptor transactionInterceptor = new TransactionInterceptor(platformTransactionManager);
        TransactionCallback<Integer> transactionCallback = new TransactionCallback<Integer>() {
            public Integer doInTransaction(TransactionStatus status) {
                return 10;
            }
        };

        try {
            Integer result = transactionInterceptor.execute(transactionCallback);
            System.out.println("Result: " + result);
        } catch (TransactionException e) {
            e.printStackTrace();
        }
    }
}