package org.example;


import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload uploadHandler = new ServletFileUpload(factory);
        HttpServletRequest request;

        try {
            List fileItems = uploadHandler.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}