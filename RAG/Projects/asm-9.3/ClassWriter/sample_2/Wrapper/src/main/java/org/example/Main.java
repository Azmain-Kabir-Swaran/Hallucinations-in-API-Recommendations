package org.example;


import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Main {

    public static void main(String[] args) throws Exception {

        // create a new ClassWriter
        ClassWriter cw = new ClassWriter(0);

        // define the class version
        int VERSION = Opcodes.V1_7;

        // start the class with the required modifiers and version
        cw.visit(VERSION, Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER, "HelloWorld", null, "java/lang/Object", null);

        // visit the constructor method of the class
        cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        // generate code for method body
        cw.visitCode();
        // generate instructions to execute
        cw.visitVarInsn(Opcodes.ALOAD, 0);
        cw.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        cw.visitInsn(Opcodes.RETURN);
        // end method
        cw.visitMaxs(1, 1);
        cw.visitEnd();

        // visit the main method of the class
        cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);

        // generate code for method body
        cw.visitCode();
        // generate instructions to execute
        cw.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        cw.visitLdcInsn("Hello World");
        cw.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
        cw.visitInsn(Opcodes.RETURN);
        // end method
        cw.visitMaxs(2, 1);
        cw.visitEnd();

        // end the class
        cw.visitEnd();

        // generate the byte code and write it to a file named HelloWorld.class
        byte[] b = cw.toByteArray();
        java.io.File file = new java.io.File("HelloWorld.class");
        java.io.FileOutputStream fileOut = new java.io.FileOutputStream(file);
        fileOut.write(b);
        fileOut.close();
    }
}