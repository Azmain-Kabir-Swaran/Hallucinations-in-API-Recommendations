package org.example;


import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class Main {

    public static void main(String[] args) {
        
        // create a TransactionAttributeSource
        TransactionAttributeSource attributeSource = new TransactionAttributeSource() {
            @Override
            public TransactionAttribute getTransactionAttribute(Object method, Class<?> targetClass) {
                // return a new TransactionAttribute object here
                return new TransactionAttribute();
            }
        };

        // create a TransactionAttributeSourceAdvisor
        TransactionAttributeSourceAdvisor advisor = new TransactionAttributeSourceAdvisor();
        advisor.setTransactionAttributeSource(attributeSource);

        // create a TransactionInterceptor
        TransactionInterceptor interceptor = new TransactionInterceptor();
        interceptor.setTransactionAttributeSource(attributeSource);

        try {
            // start a new transaction
            TransactionSynchronizationManager.beginTransaction(null);

            // execute some business logic...

            // commit the transaction
            TransactionSynchronizationManager.commit(null);

        } catch (Exception e) {
            // handle the exception
        }
    }
}