package org.example;


import org.slf4j.MDC;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        MDC.put("transactionId", StringUtils.abbreviate(UUID.randomUUID().toString(), 8));
        System.out.println("Transaction ID: " + MDC.get("transactionId"));
        MDC.clear();
    }
}