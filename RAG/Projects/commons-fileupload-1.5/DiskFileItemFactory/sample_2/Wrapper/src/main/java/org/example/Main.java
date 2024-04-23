package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        servletFileUpload.setSizeMax(1024 * 1024); // 1MB

        try {
            List<FileItem> fileItems = servletFileUpload.parseRequest(null);
            // your processing code here
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}