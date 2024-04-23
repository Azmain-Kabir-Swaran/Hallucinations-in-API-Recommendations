package org.example;


import org.apache.commons.beanutils.BeanUtilsBean;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static class Source {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Target {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Source source = new Source();
        source.setName("John");
        source.setAge(30);

        Target target = new Target();

        try {
            BeanUtilsBean.getInstance().copyProperties(target, source);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("Name: " + target.getName());
        System.out.println("Age: " + target.getAge());
    }
}