package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class Main {
    public static void handleFileUpload(HttpServletRequest request) throws FileUploadException {
        boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
        
        if(isMultipartContent) {
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload fileUpload = new ServletFileUpload(fileItemFactory);
            List<FileItem> fileItems = fileUpload.parseRequest(request);

            for(FileItem item : fileItems) {
                if(!item.isFormField()) {
                    String fileName = item.getName();
                    // Process the uploaded file, e.g., save it to the disk.
                }
            }
        }
    }
    
    public static void main(String[] args) throws FileUploadException {
        // Fake request.
        HttpServletRequest request = null; 
        handleFileUpload(request);
    }
}