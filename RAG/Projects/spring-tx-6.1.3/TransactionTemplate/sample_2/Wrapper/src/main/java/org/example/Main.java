package org.example;


import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

public class Main {

    private TransactionTemplate transactionTemplate;

    public Main(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void performOperation() {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                try {
                    // perform database operations here
                    System.out.println("Operation performed successfully");
                } catch (RuntimeException e) {
                    System.out.println("Operation failed, rolling back");
                    status.setRollbackOnly();
                }
            }
        });
    }

    public static void main(String[] args) {
        TransactionTemplate template = new TransactionTemplate();
        // assuming we've set a transaction manager on the template...
        Main main = new Main(template);
        main.performOperation();
    }
}