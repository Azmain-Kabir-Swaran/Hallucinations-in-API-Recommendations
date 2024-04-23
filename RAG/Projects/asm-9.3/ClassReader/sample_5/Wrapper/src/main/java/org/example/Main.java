package org.example;


import org.objectweb.asm.ClassReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String className = Main.class.getName().replace('.', '/') + ".class";
        ClassReader cr;
        try {
            cr = new ClassReader(className);
            System.out.println("Class name: " + cr.getClassName());
            System.out out.println("Super name: " + cr.getSuperName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}