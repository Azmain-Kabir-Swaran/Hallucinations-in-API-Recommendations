package org.example;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {

    public static void main(String[] args) {
        try {
            TransactionStatus ts = TransactionSynchronizationManager.getActualTransactionStatus();
            TransactionDefinition td = new TransactionDefinition() {

                @Override
                public int getPropagationBehavior() {
                    return 0;
                }

                @Override
                public int getIsolationLevel() {
                    return 0;
                }

                @Override
                public int getTimeout() {
                    return 0;
                }

                @Override
                public boolean isReadOnly() {
                    return false;
                }

                @Override
                public String getName() {
                    return "name";
                }
            };
            
            TransactionSystemException tse = new TransactionSystemException("Test transaction system exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}