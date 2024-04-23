package org.example;

import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.aopalliance.intercept.MethodInvocation;

class MyTransactionAttributeSource implements TransactionInterceptor.TransactionAttributes {
    public TransactionAttribute getTransactionAttribute(Method method, Class<?> targetClass) {
        return new DefaultTransactionAttribute();
    }
}