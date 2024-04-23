package org.example;


import org.slf4j.MDC;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // put some variables
        Map<String, String> map = new HashMap<>();
        map.put("user", "testUser");
        map.put("session", "testSession");

        // set variables in the context
        MDC.setContextMap(map);

        // log some information
        MDC.put("someInfo", "someValue");

        // get value from context
        String user = MDC.get("user");

        // remove variable from context
        MDC.remove("session");

        // clear the context
        MDC.clear();
    }
}