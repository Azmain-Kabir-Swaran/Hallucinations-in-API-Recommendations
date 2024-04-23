package org.example;


import org.apache.commons.lang3.CharEncoding;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = "This is the content to be encoded.";
        String encoding = CharEncoding.UTF_8;

        byte[] bytes = content.getBytes(encoding);
        System.out.println("Encoded content: " + new String(bytes, encoding));

        String fileName = "test.txt";
        Path path = Paths.get(fileName);
        Files.write(path, bytes, StandardCharsets.UTF_8);

        byte[] readBytes = Files.readAllBytes(path);
        String readContent = new String(readBytes, encoding);
        System.out.println("Read content: " + readContent);
    }
}