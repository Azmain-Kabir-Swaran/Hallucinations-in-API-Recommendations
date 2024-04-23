package org.example;


import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve platform transaction manager
        PlatformTransactionManager transactionManager = (PlatformTransactionManager) context.getBean("transactionManager");

        // Create transactional proxy
        TransactionProxyFactoryBean transactionProxy = new TransactionProxyFactoryBean();
        transactionProxy.setTransactionManager(transactionManager);

        // Call method in transaction
        BusinessService businessService = (BusinessService)transactionProxy.getObject();
        businessService.execute();
    }
}