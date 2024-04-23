package org.example;

import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class Main {

    private final TransactionTemplate transactionTemplate = new TransactionTemplate();

    public void startTransaction() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {

            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                // The transaction logic here
            }
        });
    }

    public void startTransactionWithResult() {
        Object result = transactionTemplate.execute(new TransactionCallback<Object>() {

            @Override
            public Object doInTransaction(TransactionStatus status) {
                // The transaction logic here with return value
                return null;
            }
        });
    }
}