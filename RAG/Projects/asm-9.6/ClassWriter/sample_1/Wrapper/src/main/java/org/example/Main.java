package org.example;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Main {

    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_7, Opcodes.ACC_PUBLIC, "Example", null, "java/lang/Object", null);
        cw.visitEnd();
        byte[] classBytes = cw.toByteArray();
    }
}