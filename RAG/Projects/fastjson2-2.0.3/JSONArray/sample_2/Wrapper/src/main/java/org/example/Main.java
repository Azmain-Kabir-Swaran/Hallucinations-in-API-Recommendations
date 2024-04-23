package org.example;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

class Main {
    public static void main(String[] args) {
        // Let's create a new JSONArray object
        JSONArray array = new JSONArray();
        
        // And put two JSONObjects into it
        array.add(new JSONObject().fluentPut("name", "John").fluentPut("age", "24"));
        array.add(new JSONObject().fluentPut("name", "Sarah").fluentPut("age", "27"));
        
        // Now, let's print the JSONArray
        System.out.println(array.toJSONString());
        
        // Or if you prefer, let's parse the JSONArray back into JSONObject
        JSONArray parsedArray = JSONArray.parseArray(array.toJSONString());
        
        // Now we have our parsedArray, we can also parse it into Java objects.
        for(int i = 0; i < parsedArray.size(); i++){
            JSONObject obj = parsedArray.getJSONObject(i);
            String name = obj.getString("name");
            int age = obj.getIntValue("age");
            
            System.out.println("Name: " + name + ", Age: " + age);
        }
        
        // Now let's create a JSONObject from a Java object
        User user = new User("Joe", 30);
        JSONObject userObject = (JSONObject) JSON.toJSON(user);
        
        System.out.println(userObject.toJSONString());
    }
}