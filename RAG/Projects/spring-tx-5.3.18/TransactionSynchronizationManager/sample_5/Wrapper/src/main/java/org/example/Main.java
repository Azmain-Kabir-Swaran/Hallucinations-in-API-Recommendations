package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {

    private ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

    public static void main(String[] args) {
        Main main = new Main();
        main.execute();
    }

    public void execute() {
        try {
            doInTransaction(this::doCommit);
            doInTransaction(this::doRollback);
        } finally {
            TransactionSynchronizationManager.clearSynchronization();
        }
    }

    private void doInTransaction(Runnable runnable) {
        TransactionSynchronizationManager.initSynchronization();
        runnable.run();
        TransactionSynchronizationManager.notifyBeforeCommit(true);
        TransactionSynchronizationManager.notifyCommit(true);
    }

    private void doCommit() {
        // This will commit the transaction
    }

    private void doRollback() {
        throw new RuntimeException(); // This will cause the transaction to rollback
    }
}