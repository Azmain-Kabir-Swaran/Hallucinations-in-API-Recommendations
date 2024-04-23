package org.example;


import groovy.lang.Expando;
import groovy.lang.MetaClassRegistry;
import groovy.lang.ExpandoMetaClass;

public class Main {
    public static void main(String[] args) {
        Expando obj = new Expando();
        ExpandoMetaClass expandoMetaClass = (ExpandoMetaClass) MetaClassRegistry.getMetaClassRegistry().getMetaClass(obj.getClass());
        expandoMetaClass.setProperty(obj, "name", "John Doe");
        expandoMetaClass.setProperty(obj, "age", "30");
        expandoMetaClass.methodMissing = { String methodName, args ->
            if(methodName.startsWith("get")) {
                String propertyName = methodName.substring(3);
                return obj."${propertyName}";
            }
            throw new MissingMethodException(methodName, obj.getClass(), args);
        }
        println(obj.getName());  // Print: John Doe
        println(obj.getAge());  // Print: 30
    }
}