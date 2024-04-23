package org.example;


import org.objectweb.asm.ClassReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassReader cr = new ClassReader("java.lang.Runnable");
        cr.accept(new ClassPrinter(), 0);
    }
}