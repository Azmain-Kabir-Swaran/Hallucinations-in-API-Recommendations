package org.example;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Main {

    public static void main(String[] args) throws Exception {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_1, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE, "MyClass", null, "java/lang/Cloneable", null);
        cw.visitEnd();
        byte[] b = cw.toByteArray();
        writeToFile(b, "MyClass.class");
    }

    private static void writeToFile(byte[] bytes, String name) throws Exception {
        java.io.FileOutputStream fos = new java.io.FileOutputStream(name);
        fos.write(bytes);
        fos.close();
    }
}