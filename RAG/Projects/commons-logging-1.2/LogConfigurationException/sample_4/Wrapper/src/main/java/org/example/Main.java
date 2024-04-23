package org.example;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

public class Main {
    private final Log log = LogFactory.getLog(getClass());

    public void someMethod() {
        try {
            //your code here
        } catch (Exception e) {
            log.error("An error occurred", e);
        }
    }

    public static void main(String[] args) {
        new Main().someMethod();
    }
}