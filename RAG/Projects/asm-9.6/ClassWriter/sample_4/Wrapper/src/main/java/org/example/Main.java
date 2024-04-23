package org.example;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public class Main extends ClassVisitor {

    public Main(int api) {
        super(api);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println("Class name: " + name);
    }

    public static void main(String[] args) throws Exception {
        ClassReader reader = new ClassReader("MyClass");
        ClassWriter writer = new ClassWriter(reader, ClassWriter.COMPUTE_MAXS);
        Main visitor = new Main(ClassWriter.COMPUTE_MAXS);
        reader.accept(visitor, 0);
    }
}