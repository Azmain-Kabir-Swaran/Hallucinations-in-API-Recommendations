package org.example;


import java.io.File;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;

public class Main {

    public static void main(String[] args) throws FileUploadException {
        // Create a factory
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();

        // Set a repository for temporary files
        diskFileItemFactory.setRepository(new File("/tmp"));

        // Create an item
        FileItem fileItem = diskFileItemFactory.createItem("uploadedFile", "text/plain", true, "uploadedFile.txt");

        System.out.println("File name: " + fileItem.getName());
        System.out.println("File size: " + fileItem.getSize());
        System.out.println("Content type: " + fileItem.getContentType());
    }
}