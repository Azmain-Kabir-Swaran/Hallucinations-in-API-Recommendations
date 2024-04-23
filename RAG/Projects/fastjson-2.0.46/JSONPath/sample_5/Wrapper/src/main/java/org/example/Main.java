package org.example;


import com.alibaba.fastjson.JSONPath;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Let's consider JSON as a Map
        Map<String, Object> jsonMap = new JSONObject(json);

        // JSONPath expression is a string so we define a single value for simplicity
        String jsonPathExpression = "$.fieldname";
        
        // Evaluate the JSONPath expression using evaluate method, it returns an Object
        Object result = JSONPath.eval(jsonMap, jsonPathExpression);
        
        System.out.println(result);
    }
}