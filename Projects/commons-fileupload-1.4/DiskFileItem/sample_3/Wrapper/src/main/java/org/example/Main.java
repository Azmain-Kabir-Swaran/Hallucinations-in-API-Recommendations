package org.example;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory(10000, null);
        DiskFileItem diskFileItem = diskFileItemFactory.createItem("testField", "text/plain");

        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[1024];
        secureRandom.nextBytes(randomBytes);
        String randomString = new String(randomBytes, StandardCharsets.UTF_8);

        OutputStream outputStream = diskFileItem.getOutputStream();
        outputStream.write(randomString.getBytes(StandardCharsets.UTF_8));
        outputStream.close();

        File tempFile = File.createTempFile("prefix", ".tmp");
        tempFile.deleteOnExit();

        IOUtils.copy(diskFileItem.getInputStream(), new FileOutputStream(tempFile));
    }
}