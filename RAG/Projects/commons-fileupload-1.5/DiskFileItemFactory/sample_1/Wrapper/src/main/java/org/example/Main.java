package org.example;


import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a factory
        DiskFileItemFactory factory = new DiskFileItemFactory(sizeThreshold, repository);

        // create the file item
        FileItem item = factory.createItem("file", Files.CONTENT_DISPOSITION, mimetype);
        
        // ... or, if you have a request, you could use the RequestContext to get the items:
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        try {
            List<FileItem> items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}