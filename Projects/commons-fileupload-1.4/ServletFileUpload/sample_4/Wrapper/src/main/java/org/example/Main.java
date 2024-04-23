package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory factory = new DiskFileItemFactory(1000, null);
        ServletFileUpload sfu = new ServletFileUpload(factory);
        sfu.setSizeMax(100000);

        try {
            List<FileItem> items = sfu.parseRequest(new RequestContext());

            for (FileItem item : items) {
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    String value = item.getString();
                    System.out.println(name + " = " + value);
                } else {
                    String fieldName = item.getFieldName();
                    String fileName = item.getName();
                    File uploadedFile = new File(fieldName + " " + fileName);

                    item.write(uploadedFile);
                    System.out.println("File saved at: " + uploadedFile.getAbsolutePath());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static class RequestContext {
        // Method for simulating request context for upload
    }
}