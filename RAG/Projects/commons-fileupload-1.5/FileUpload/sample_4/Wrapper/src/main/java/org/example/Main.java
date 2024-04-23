package org.example;


import java.io.File;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main {
    public static void main(String[] args) throws Exception {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        List<FileItem> items = upload.parseRequest(new DefaultHttpRequestContext());
        FileItem item = items.get(0);

        File f = new File(item.getName());
        item.write(f);
    }
}