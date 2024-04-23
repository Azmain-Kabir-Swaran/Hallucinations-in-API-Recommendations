package org.example;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionAttributeSourceAdvisor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

public class Main {
    @Bean
    public BeanNameAutoProxyCreator transactionAutoProxy() {
        BeanNameAutoProxyCreator proxyCreator = new BeanNameAutoProxyCreator();
        proxyCreator.setProxyTargetClass(true);
        proxyCreator.setBeanNames("*Service");
        proxyCreator.setInterceptorNames("transactionAttributeSource");
        return proxyCreator;
    }

    @Bean(name = "transactionAttributeSource")
    public TransactionAttributeSourceAdvisor transactionAttributeSourceAdvisor() {
        TransactionAttributeSourceAdvisor advisor = new TransactionAttributeSourceAdvisor();
        advisor.setTransactionAttributeSource(new CustomTxAttributeSource());
        return advisor;
    }
}