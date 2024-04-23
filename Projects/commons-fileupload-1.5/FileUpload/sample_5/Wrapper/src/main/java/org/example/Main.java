package org.example;


import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);

        servletFileUpload.setSizeMax(1024 * 1024); // 1 MB
        servletFileUpload.setFileSizeMax(1024 * 1024 * 5); // 5 MB

        try {
            List<FileItem> fileItems = servletFileUpload.parseRequest(new HttpServletRequest() {
                public String getParameter(String s) {
                    return null;
                }
            });

            for (FileItem fileItem : fileItems) {
                if (!fileItem.isFormField()) {
                    File file = new File("/tmp/" + fileItem.getName());
                    fileItem.write(file);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}