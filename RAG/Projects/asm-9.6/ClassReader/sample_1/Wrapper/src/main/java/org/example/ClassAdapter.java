package org.example;

import org.objectweb.asm.*;
import org.objectweb.asm.ClassReader;

class ClassAdapter extends ClassVisitor {
    protected ClassAdapter(int api) {
        super(api);
    }

    protected ClassAdapter(int api, ClassVisitor cv) {
        super(api, cv);
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        return new MethodAdapter(super.visitMethod(access, name, descriptor, signature, exceptions));
    }
}