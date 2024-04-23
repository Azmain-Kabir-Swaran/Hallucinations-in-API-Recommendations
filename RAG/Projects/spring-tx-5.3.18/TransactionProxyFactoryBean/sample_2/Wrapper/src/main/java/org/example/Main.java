package org.example;


import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionProxyFactoryBean;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;

public class Main {

    public static void main(String[] args) {
        PlatformTransactionManager transactionManager = new PlatformTransactionManager() {
            // Implement here
        };

        // Create a TransactionProxyFactoryBean
        TransactionProxyFactoryBean transactionProxyFactoryBean = new TransactionProxyFactoryBean();
        transactionProxyFactoryBean.setTransactionManager(transactionManager);
        
        TransactionAttribute transactionAttribute = new RuleBasedTransactionAttribute();
        transactionAttribute.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        transactionProxyFactoryBean.setTransactionAttribute(transactionAttribute);

        ProxyFactoryBean factoryBean = new ProxyFactoryBean();
        factoryBean.setTarget(new Service()); // replace with actual service class
        factoryBean.setProxyTargetClass(true);

        transactionProxyFactoryBean.setAdvice(factoryBean);
        
        // Use transactionProxyFactoryBean.getObject() to get the proxy instance
    }
}