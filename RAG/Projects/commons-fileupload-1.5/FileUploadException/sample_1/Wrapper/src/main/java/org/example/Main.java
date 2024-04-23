package org.example;


import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {

    public static void main(String[] args) throws Exception {
        DiskFileItemFactory factory = new DiskFileItemFactory(1024, null);
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setHeaderEncoding("UTF-8");
        try {
            List items = upload.parseRequest(new DefaultServletFileUpload().getServletRequest());
            Iterator iterator = items.iterator();
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if (item.isFormField()) {
                    // process form field
                    String name = item.getFieldName();
                    String value = item.getString();
                } else {
                    String fileName = item.getName();
                    File file = new File(fileName);
                    item.write(file);
                    // process uploaded file
                }
            }
        } catch (FileUploadException e) {
            System.out.println(e);
        }
    }
}