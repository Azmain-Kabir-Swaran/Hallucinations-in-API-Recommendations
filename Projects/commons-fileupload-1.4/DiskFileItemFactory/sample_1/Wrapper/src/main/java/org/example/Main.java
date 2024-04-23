package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    //This is your main method where the magic happens
    public static void main(String[] args) {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List<FileItem> items = upload.parseRequest(new HttpServletRequest() {
            });

            for (FileItem item : items) {
                if (!item.isFormField()) {
                    File file = new File("your_temp_directory_path" + File.separator + item.getName());
                    item.write(file);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}