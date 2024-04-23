package org.example;


import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache_commons_fileupload_FileItem;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("path_to_your_file"); // replace "path_to_your_file" with the actual path to your local file
        DiskFileItem fileItem = createFileItem("fieldName", file); // replace "fieldName" with the actual field name that the file was uploaded as

        // Now you can use fileItem in your application, for example to upload it to a server.
        // Here we just print the absolute path of the file:
        System.out.println("Uploaded file path: " + fileItem.getStoreLocation().getAbsolutePath());
    }

    private static DiskFileItem createFileItem(String fieldName, File file) {
        DiskFileItem fileItem = null;
        try {
            DiskFileItemFactory diskFactory = new DiskFileItemFactory();
            fileItem = diskFactory.createItem(fieldName, "text/plain", true, file.getName());
            fileItem.getOutputStream().write(new FileInputStream(file));
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileItem;
    }
}