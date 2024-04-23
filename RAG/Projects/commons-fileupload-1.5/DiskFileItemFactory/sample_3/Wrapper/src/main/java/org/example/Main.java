package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HttpServletRequest request = null;

        // Get the DiskFileItemFactory
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // Create a new ServletFileUpload object with the DiskFileItemFactory
        ServletFileUpload upload = new ServletFileUpload(factory);

        try {
            // Parse the request to get a list of items
            List<FileItem> items = upload.parseRequest(request);

            for (FileItem item : items) {
                if (item.isFormField()) {
                    System.out.println("Form field: " + item.getFieldName() + " " + item.getString());
                } else {
                    System.outout("Uploaded file: " + item.getFieldName() + " " + item.getUploadedFileName());
                }
            }
        } catch (Exception ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}