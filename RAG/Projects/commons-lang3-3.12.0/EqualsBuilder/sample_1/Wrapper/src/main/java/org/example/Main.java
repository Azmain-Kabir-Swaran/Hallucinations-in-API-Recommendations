package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.Objects;

public class Main {
    
    public static void main(String[] args) {
        // Instantiate objects to compare
        MyObject obj1 = new MyObject("test1");
        MyObject obj2 = new MyObject("test2");
        MyObject obj3 = new MyObject("test1");
        
        // EqualsBuilder comparison
        boolean result1 = EqualsBuilder.reflectionEquals(obj1, obj2);
        System.out.println("EqualsBuilder result (same objects): " + result1); // Prints: false
        
        boolean result2 = EqualsBuilder.reflectionEquals(obj1, obj3);
        System.out.println("EqualsBuilder result (same content): " + result2); // Prints: true
    }
    
    private static class MyObject {
        private String name;
        
        public MyObject(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            MyObject that = (MyObject) obj;
            return Objects.equals(this.name, that.name);
        }
    }
}