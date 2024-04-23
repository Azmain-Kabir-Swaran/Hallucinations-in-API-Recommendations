package org.example;


import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    @Autowired
    private SomeTransactionalService service;

    public void startAndCommitTransaction() {
        // get the transaction status
        TransactionStatus status = TransactionSynchronizationManager.getCurrentTransactionStatus();

        // start a new transaction if one is not already running or participating
        if (status.isNewTransaction()) {
            try {
                TransactionSynchronizationManager.beginTransaction(TransactionDefinition.PROPAGATION_REQUIRED);
                service.someBusinessLogic();
                TransactionSynchronizationManager.commit(status);
            } catch (TransactionException e) {
                TransactionSynchronizationManager.rollback(status);
            }
        } else {
            // just call the service method if transaction is already running
            service.someBusinessLogic();
        }
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Main main = context.getBean(Main.class);
        main.startAndCommitTransaction();
    }
}