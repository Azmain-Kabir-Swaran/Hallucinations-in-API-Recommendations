package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Create a new instance of DiskFileItemFactory
        DiskFileItemFactory factory = new DiskFileItemFactory(1024, new File("temp"));

        //Create a new item for the file
        FileItem fileItem = factory.createItem("file", "text/plain", true, "testFile.txt");

        //Check if the file is in a readable state
        System.out.println("Is file readable? " + fileItem.isInMemory());

        //Get the name of the file
        System.out.println("File name: " + fileItem.getName());

        //Get the content type of the file
        System.out.println("File content type: " + fileItem.getContentType());

        //Get the file size in bytes
        System.out.println("File size: " + fileItem.getSize());
    }
}