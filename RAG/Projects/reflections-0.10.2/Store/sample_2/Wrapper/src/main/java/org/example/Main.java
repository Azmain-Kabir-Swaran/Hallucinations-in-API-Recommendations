package org.example;


import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Reflections reflections = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()).setScanners(new SubTypesScanner()));
        Set<Class<?>> subTypes = reflections.getSubTypesOf(Object.class);

        for (Class<?> subType : subTypes) {
            if (subType.isAnnotationPresent(TestAnnotation.class)) {
                System.out.println("The class " + subType.getName() + " is annotated with @TestAnnotation");
            }
        }
    }
}