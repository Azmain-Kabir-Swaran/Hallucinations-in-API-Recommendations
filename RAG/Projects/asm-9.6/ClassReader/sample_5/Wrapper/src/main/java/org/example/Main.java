package org.example;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("main.class");
        int parsingOptions = ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES;
        try (InputStream is = new FileInputStream(file)) {
            ClassReader cr = new ClassReader(is);
            ClassWriter cw = new ClassWriter(0);
            cr.accept(cw, parsingOptions);
            try (OutputStream os = new FileOutputStream("out.class")) {
                os.write(cw.toByteArray());
            }
        }
    }
}