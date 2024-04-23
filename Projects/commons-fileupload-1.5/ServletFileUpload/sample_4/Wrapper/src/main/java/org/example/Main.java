package org.example;


import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {
    public static void main(String[] args) throws FileUploadException {
        ServletFileUpload upload = new ServletFileUpload();
        FileItemFactory factory = new DiskFileItemFactory();
        upload.setFileItemFactory(factory);

        // Set max size of request (the size in bytes), the default is 20971520 (20MB).
        upload.setSizeMax(1024);

        try {
            List<FileItem> items = upload.parseRequest(new MockRequest(
              new File("/path/to/your/file")));

            for (FileItem item : items) {
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    String value = item.getString();
                    // process the fields
                } else {
                    File uploadedFile = new File(item.getName());
                    item.write(uploadedFile);
                    // process the uploaded files
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}