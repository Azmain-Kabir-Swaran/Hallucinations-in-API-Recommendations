package org.example;

import java.io.File;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServlet;
import java.util.List;

public class Main extends HttpServlet {
    private static final String UPLOAD_DIRECTORY = "uploads";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Verify the servlet is handling a multipart/form-data submission
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                factory.setSizeThreshold(1024 * 1024); // maximum size that will be stored in memory
                factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setSizeMax(1024 * 1024 * 50); // maximum size file that the user will send
                upload.setHeaderEncoding("UTF-8");

                List<FileItem> items = upload.parseRequest(request);

                for (FileItem item : items) {
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + fileName));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}