package org.example;


import org.objectweb.asm.*;
import org.objectweb.asm.ClassReader;

public class Main {
    public static void main(String[] args) {
        String className = "path_to_the_class";
        try {
            ClassReader cr = new ClassReader(className);
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cr.accept(new ClassAdapter(cw) {
                @Override
                public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
                    return new MethodAdapter(super.visitMethod(access, name, desc, signature, exceptions));
                }
            }, ClassReader.SKIP_DEBUG);
            byte[] classBytes = cw.toByteArray();
            FileOutputStream fout = new FileOutputStream(className);
            fout.write(classBytes);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}