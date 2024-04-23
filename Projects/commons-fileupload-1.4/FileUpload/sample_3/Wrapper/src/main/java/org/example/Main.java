package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);

        // Process the uploaded items
        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            if (item.isFormField()) {
                // Handle form fields
            } else {
                // Handle uploaded files
                String fileName = item.getName();
                InputStream fileContent = item.getInputStream();

                // Save the uploaded file
                try (OutputStream output = new FileOutputStream("/path/to/save/" + fileName)) {
                    int read = 0;
                    byte[] bytes = new byte[1024];

                    while ((read = fileContent.read(bytes)) != -1) {
                        output.write(bytes, 0, read);
                    }
                }
            }
        }
    }
}