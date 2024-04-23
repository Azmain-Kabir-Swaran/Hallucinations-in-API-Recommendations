package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.langxpect;
import org.springframework.stereotype.*;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {
   private Logger logger = LoggerFactory.getLogger(this.getClass());

   @Around("@annotation(org.springframework.stereotype.Service)")
   public Object logMethodParamsAndTime(ProceedingJoinPoint joinPoint) throws Throwable {
      Object[] args = joinPoint.getArgs();
      logger.info(String.format("Executing method %s with params: %s", joinPoint.getSignature().getName(), Arrays.toString(args)));
      long startTime = System.currentTimeMillis();

      Object result = joinPoint.proceed(args);

      long elapsedTime = System.currentTimeMillis() - startTime;
      logger.info(String.format("Executed method %s, took %dms", joinPoint.getSignature().getName(), elapsedTime));
      
      return result;
   }
}