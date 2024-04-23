package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.langlang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

public class LoggingAspect {

    private Logger logger = Logger.getLogger("MyLogger");
    
    @Around("execution(* com.mycompany.myapp.myService.*(..))")
    public void log(JoinPoint joinPoint) throws Throwable {
        // Before method execution
        logger.info("Method : " + joinPoint.getSignature().getName() + " called");

        try {
            // Execute the method
            joinPoint.proceed();
        } catch (Throwable ex) {
            // Catching exceptions
            logger.severe("Exception in method " + joinPoint.getSignature().getName());
            throw ex;
        } finally {
            // After method execution
            logger.info("Method : " + joinPoint.getSignature().getName() + " execution finished");
        }
    }
}