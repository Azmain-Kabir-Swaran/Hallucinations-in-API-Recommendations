package org.example;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Main {
    public static void main(String[] args) {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE,
                "test/Class1", null, "java/lang/Object", null);
        cw.visitEnd();
        byte[] classBytes = cw.toByteArray();
        // Now, you can save the classBytes to file.
    }
}