package org.example;

import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BusinessService {
    public void execute() {
        System.out.println("Business operation executed within a transaction...");
    }
}