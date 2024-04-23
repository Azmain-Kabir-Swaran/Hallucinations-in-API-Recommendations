package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.AfterThrowing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class ExceptionLoggerAspect {

    Logger logger = LoggerFactory.getLogger(ExceptionLoggerAspect.class);

    @AfterThrowing(pointcut = "execution(* your.main.package..*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Throwable ex) {
        logger.error("Exception occurred while executing " + joinPoint.getSignature() + " - " + ex.getMessage());
    }
}