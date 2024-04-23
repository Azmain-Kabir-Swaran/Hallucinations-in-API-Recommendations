package org.example;


import java.io.IOException;
import org.objectweb.asm.ClassReader;

public class Main {
    public static void main(String[] args) {
        try {
            ClassReader cr = new ClassReader("Main");
            cr.accept(new ClassReader.ExplicitClassVisitor() {
                @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    System.out.println("Fully Qualified Name: " + name);
                }
            }, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}