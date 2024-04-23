package org.example;

import org.springframework.aop.aspectj.AspectJAwareAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class MyConfiguration {

    @Bean
    public AspectJAwareAdvisorAutoProxyCreator aspectJAwareAdvisorAutoProxyCreator() {
        return new AspectJAwareAdvisorAutoProxyCreator();
    }

    // Other bean definitions...
}