package org.example;


import org.slf4j.spi.MDCAdapter;
import org.slf4j.MDC;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, String> contextMap = new HashMap<>();

    public static void main(String[] args) {
        MDC.put("test", "value");
        System.out.println(MDC.get("test")); // "value"
    }

    static class StaticMDCBinder {
        public static StaticMDCBinder getSingleton() {
            return new StaticMDCBinder();
        }

        public MDCAdapter getMDCA() {
            return new MDCAdapter() {
                @Override
                public String get(String key) {
                    return contextMap.get(key);
                }

                @Override
                public void put(String key, String msg) {
                    contextMap.put(key, msg);
                }

                @Override
                public void remove(String key) {
                    contextMap.remove(key);
                }

                @Override
                public void clear() {
                    contextMap.clear();
                }

                @Override
                public Map<String, String> getCopyOfContextMap() {
                    return new HashMap<String, String>(contextMap);
                }

                @Override
                public void setContextMap(Map<String, String> contextMap) {
                    Main.contextMap = contextMap;
                }
            };
        }
    }
}