package org.example;


import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    
    public void handleFileUpload(HttpServletRequest request, String saveDirectory) throws Exception {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List<DiskFileItem> items = (List<DiskFileItem>) upload.parseRequest(request);
            for (DiskFileItem item : items) {
                if (item.isFormField()) {
                    // TODO: process form fields
                } else {
                    File file = new File(saveDirectory + File.separator + item.getName());
                    FileOutputStream out = new FileOutputStream(file);
                    try {
                        out.write(item.getInputStream().readAllBytes());
                    } finally {
                        out.close();
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception("Upload failed", e);
        }
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.handleFileUpload(null, "/path/to/save/directory");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}