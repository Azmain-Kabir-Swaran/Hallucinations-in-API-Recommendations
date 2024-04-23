package org.example;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ClassWriter cw = new ClassWriter(0);
        
        cw.visit(Opcodes.V1_1, Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE, "MyClass", null, "java/lang/Object", null);
        
        MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT, "doSomething", "()V", null, null);
        mv.visitCode();
        mv.visitEnd();
        
        cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "myField", "I", null, new Integer(10)).visitEnd();

        cw.visitEnd();

        byte[] data = cw.toByteArray();
        
        try (FileOutputStream fos = new FileOutputStream("MyClass.class")) {
            fos.write(data);
        }
    }
}