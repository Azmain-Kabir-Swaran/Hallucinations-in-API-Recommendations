package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.disk.DiskFileItem;

public class Main {
    public static void main(String[] args) {
        // Create a new DiskFileItem object
        DiskFileItem item = new DiskFileItem("fieldName", DiskFileItem.FORM_DATA, true, "test.txt");

        // Get the file path of the item
        String filePath = item.getStoreLocation();

        // Convert the file path to File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}