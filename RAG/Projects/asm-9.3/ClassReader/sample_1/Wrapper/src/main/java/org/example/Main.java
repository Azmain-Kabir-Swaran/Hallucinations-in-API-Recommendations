package org.example;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.Opcodes;

public class Main {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader("Main");
        cr.accept(new ClassReader(Opcodes.ASM9), 0);
    }
}