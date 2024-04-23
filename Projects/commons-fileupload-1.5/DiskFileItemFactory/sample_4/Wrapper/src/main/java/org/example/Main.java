package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory fileFactory = new DiskFileItemFactory(1000000, new File("temp"));
        ServletFileUpload upload = new ServletFileUpload(fileFactory);
        try {
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    // process the file upload here...
                } else {
                    // process the form field here...
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}