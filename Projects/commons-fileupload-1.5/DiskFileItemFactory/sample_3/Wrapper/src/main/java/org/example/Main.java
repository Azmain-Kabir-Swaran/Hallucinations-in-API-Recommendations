package org.example;


import java.io.File;
import java.util.List;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServletRequest;

public class Main {
    private static final int MEMORY_THRESHOLD = 1024 * 1024;  // 1MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 10;  // 10MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 20;  // 20MB

    public static void main(String[] args) {
        // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(MEMORY_THRESHOLD);

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);

        // Set overall request size constraint
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // Set size thresholds for an individual file
        upload.setFileSizeMax(MAX_FILE_SIZE);

        // Set repository
        File repository = (File) ServletActionContext.getServletContext().getAttribute(ServletContext.TEMPDIR);
        upload.setRepository(repository);

        try {
            // Parse the request
            List<FileItem> items = upload.parseRequest(new HttpServletRequest() {
                @Override
                public String getContentType() {
                    return null;
                }

                @Override
                public String getParameter(String name) {
                    return null;
                }

                @Override
                public Object getAttribute(String name) {
                    return null;
                }

                @Override
                public String getHeader(String name) {
                    return null;
                }

                @Override
                public Enumeration getHeaders(String name) {
                    return null;
                }
            });

            // Process the uploaded items
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    File uploadedFile = new File(repository + File.separator + fileName);
                    item.write(uploadedFile);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}