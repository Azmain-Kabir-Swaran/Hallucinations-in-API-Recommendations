package org.example;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Main {
    public static void main(String[] args) throws Exception {
        // Load a class
        ClassReader classReader = new ClassReader("java.lang.String");
        ClassVisitor cv = new ClassVisitor(Opcodes.ASM9) {
            // Insert additional methods/code here
        };
        
        // Transform the class
        classReader.accept(cv, 0);
        
        // Get the byte code
        byte[] data = classReader.getBytes();

        // Create a new ClassWriter
        ClassWriter cw = new ClassWriter(0);
        classReader.accept(cw, 0);

        // Obtain the modified byte code
        byte[] newByteCode = cw.toByteArray();
    }
}