package org.example;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.httpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

public class Main {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();
            
            // Configure a repository (to demo file saving)
            factory.setRepository(new File("c:\\temp"));

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);
            
            // Parse the request
            List<FileItem> items = upload.parseRequest(request);
            
            // Process the uploaded items and save each file to a temporary location
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    String fileName = item.getName();
                    File uploadedFile = new File("c:\\temp", fileName);
                    FileOutputStream fos = new FileOutputStream(uploadedFile);
                    IOUtils.copy(item.getInputStream(), fos);
                    fos.close();
                    
                    // Print the name of the uploaded file
                    System.out.println("Uploaded file name: " + uploadedFile.getName());
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}