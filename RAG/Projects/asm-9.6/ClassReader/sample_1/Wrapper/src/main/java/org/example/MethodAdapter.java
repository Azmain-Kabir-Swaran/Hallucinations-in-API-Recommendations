package org.example;

import org.objectweb.asm.*;
import org.objectweb.asm.ClassReader;

class MethodAdapter extends AdviceAdapter {
    protected MethodAdapter(MethodVisitor mv) {
        super(ASM9, mv, null, null);
    }

    @Override
    public void visitEnd() {
        System.out.println("method is visited");
    }
}