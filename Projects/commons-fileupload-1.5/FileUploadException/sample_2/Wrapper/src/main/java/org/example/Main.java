package org.example;

import java.io.File;
import java.io.IOException;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.httpServletResponse;

public class Main {
    
    public static void handleFileUpload(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        
        if (!isMultipart) {
            throw new FileUploadBase.FileUploadIOException("The request does not multipart/form-data.");
        }
        
        ServletFileUpload upload = new ServletFileUpload();
        upload.setHeaderEncoding("UTF-8");
        
        try {
            List<FileItem> items = upload.parseRequest(request);
            
            for(FileItem item : items) {
                if(item.isFormField()) {
                    processFormField(item.getFieldName(), item.getString());
                } else {
                    processUploadedFile(item);
                }
            }
        } catch (FileUploadException e) {
            handleFileUploadException(e);
        }
    }
    
    private static void handleFileUploadException(FileUploadException e) throws ServletException {
        throw new ServletException("File upload failed.", e);
    }
    
    private static void processFormField(String name, String value) {
        System.out.println("Processing form field " + name + " with value " + value);
    }
    
    private static void processUploadedFile(FileItem item) {
        System.out.println("Processing uploaded file " + item.getName());
        // Process uploaded file
    }
}