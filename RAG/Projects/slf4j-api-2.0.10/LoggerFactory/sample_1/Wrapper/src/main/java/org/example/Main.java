package org.example;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {

        // use commons lang StringUtils library
        String result = StringUtils.upperCase("test");
        logger.info("The upper case of 'test' is: " + result);
        
    }
}