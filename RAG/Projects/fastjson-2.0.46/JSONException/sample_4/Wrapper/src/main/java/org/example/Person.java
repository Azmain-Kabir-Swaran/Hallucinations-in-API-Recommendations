package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import java.util.List;

class Person {
    private String name;
    private int age;

    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    // Setters and constructors not implemented
}