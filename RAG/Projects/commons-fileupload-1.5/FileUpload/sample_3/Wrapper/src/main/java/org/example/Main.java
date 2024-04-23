package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;

public class Main {
    private static final String UPLOAD_DIRECTORY = "upload";

    public static void main(String[] args) throws Exception {
        HttpServletRequest request = null; //replace with actual http request object
        processUpload(request);
    }

    public static void processUpload(HttpServletRequest request) throws Exception {
        DiskFileItemFactory factory = new DiskFileItemFactory();

        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(100000);

        List<FileItem> items = upload.parseRequest(request);
        if (items != null && items.size() > 0) {
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    File path = new File(Main.class.getClassLoader().getResource(UPLOAD_DIRECTORY).getFile());
                    File uploadedFile = new File(path.getAbsolutePath() + File.separator + fileName);
                    item.write(uploadedFile);
                }
            }
        }
    }
}