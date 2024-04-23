package org.example;


import com.alibaba.fastjson.JSONPObject;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "John");
        map.put("age", "30");
        map.put("city", "New York");

        JSONPObject jsonObject = new JSONPObject("callBackFunction", map);

        System.out.println(jsonObject.toJSONString());
    }
}