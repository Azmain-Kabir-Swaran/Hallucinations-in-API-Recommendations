package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItemFactory;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;

public class Main {
    public static void main(String[] args) {

        // Creating a DiskFileItem with type as TEXT
        DiskFileItem fileItem = new DiskFileItem("fileName", "text/plain", false, "filePath");

        // Getting content of DiskFileItem
        ByteSource byteSource = fileItem.getByteSource();

        // Converting ByteSource to String
        CharSource charSource = byteSource.asCharSource();

        // Reading the file item's content
        String itemContent = charSource.read();
        System.out.println(itemContent);
    }
}