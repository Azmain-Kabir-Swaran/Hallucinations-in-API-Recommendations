package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        diskFileItemFactory.setSizeThreshold(1024 * 1024);
        
        // Define a maximum of 10MB file size.
        servletFileUpload.setSizeMax(1024 * 1024 * 10);

        try {
            List<FileItem> items = servletFileUpload.parseRequest(new ServletRequestContext(new MockServletRequest()));

            // Iterate over all file items
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    // Get the file name
                    String name = new File(item.getName()).getName();
                    // Write the file to a temporary location, in reality it should be written to a permanent location.
                    item.write(new File("/tmp/" + name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}