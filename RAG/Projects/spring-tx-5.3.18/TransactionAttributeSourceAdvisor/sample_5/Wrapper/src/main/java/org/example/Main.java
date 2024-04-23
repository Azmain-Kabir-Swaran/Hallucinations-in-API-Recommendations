package org.example;


import org.springframework.aop.support.AopUtils;
import org.springframework.transaction.interceptor.TransactionAttribute;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        TransactionAttributeSource source = new TransactionAttributeSource() {
            @Override
            public TransactionAttribute getTransactionAttribute(Object joinPoint, TransactionAttribute attr) {
                return attr;
            }
        };
        TransactionAttribute attribute = source.getTransactionAttribute(null, null);
        TransactionAttributeSourceAdvisor advisor = new TransactionAttributeSourceAdvisor(source);
        boolean pointcutApplies = advisor.getPointcut().getClassFilter().matches(TransactionInterceptor.class);
        System.out.println(pointcutApplies);  // Output: true
    }
}