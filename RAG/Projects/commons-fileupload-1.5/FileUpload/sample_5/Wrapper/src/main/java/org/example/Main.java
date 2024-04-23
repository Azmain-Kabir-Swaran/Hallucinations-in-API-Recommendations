package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commonsfileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;

public class Main {
    public static String UPLOAD_DIRECTORY = "/server/upload/"; // change this to your server directory

    public static void main(String[] args) throws Exception {
        uploadFile(/* pass request object here */);
    }

    public static boolean uploadFile(HttpServletRequest request) throws Exception {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    continue; // ignore form fields
                }

                File uploadedFile = new File(UPLOAD_DIRECTORY + item.getName());
                item.write(uploadedFile);
            }
            return true;
        }
        return false;
    }
}