package org.example;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("java/lang/String");
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                System.out.println("Version: " + version);
                System.out.println("Access: " + access);
                System.out.println("Class name: " + name);
                System.out.println("Super class: " + superName);
                System.out.println("Interfaces: " + interfaces);
            }
        }, 0);
    }
}