package org.example;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        FileItemFactory factory = new DiskFileItemFactory(1024, null);
        FileItem item = factory.createItem("file", "text/plain", true, "test.txt");
        try (InputStream is = new FileInputStream(new File("test.txt"))) {
            item.getOutputStream().write(IOUtils.toByteArray(is));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}