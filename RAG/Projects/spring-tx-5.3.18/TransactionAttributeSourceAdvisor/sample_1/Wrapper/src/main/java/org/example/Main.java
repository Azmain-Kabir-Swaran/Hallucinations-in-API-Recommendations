package org.example;


import org.springframework.aop.support.AopUtils;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.transaction.interceptor.TransactionAttributeSourceAdvisor;
import org.springframework.aop.framework.AdvisedSupport;
import org.springframework.transaction.PlatformTransactionManager;

public class Main {
    public static void main(String[] args) {
        PlatformTransactionManager platformTransactionManager = null; // injected
        TransactionAttributeSourceAdvisor advisor = new TransactionAttributeSourceAdvisor();
        advisor.setTransactionAttributeSource(null); // injected
        advisor.setAdvice(null); // injected

        BeanNameAutoProxyCreator autoProxyCreator = new BeanNameAutoProxyCreator();
        autoProxyCreator.setBeanNames("myBeanName");
        autoProxyCreator.setInterceptorNames("transactionInterceptor");

        NameMatchMethodPointcutAdvisor pointcutAdvisor = new NameMatchMethodPointcutAdvisor();
        pointcutAdvisor.setMappedNames("process*");

        AdvisedSupport advised = autoProxyCreator.getAdvisedSupport();
        advised.setTransactionManager(platformTransactionManager);
    }
}