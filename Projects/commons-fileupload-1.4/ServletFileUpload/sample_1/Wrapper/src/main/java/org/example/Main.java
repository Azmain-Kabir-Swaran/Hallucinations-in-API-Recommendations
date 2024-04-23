package org.example;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main extends HttpServlet {
    public static final String UPLOAD_DIRECTORY = "upload";
    private boolean isMultipartContent(HttpServletRequest request) {
        return ServletFileUpload.isMultipartContent(request);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // Create a factory for disk-based file items
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // Configure a repository (to ensure all content is stored in memory
        // while requests are being processed)
        factory.setSizeThreshold(1024);

        // Create a new file upload handler
        ServletFileUpload upload = new ServletFileUpload(factory);

        // Maximum size that will be stored (10 MB)
        upload.setSizeMax(1024 * 1024 * 10);

        try {
            // Parse the request to get the multi-part form data
            List<FileItem> multiparts = upload.parseRequest(request);

            for (FileItem item : multiparts) {
                if (item.isFormField()) {
                    System.out.println("Form field: " + item.getFieldName() + "=" + item.getString());
                } else {
                    String fileName = new File(item.getName()).getName();
                    String filePath = UPLOAD_DIRECTORY + File.separator + fileName;
                    File uploadedFile = new File(filePath);
                    // Save the file locally
                    item.write(uploadedFile);
                    request.setAttribute("message", "Uploaded: " + fileName);
                }
            }

        } catch (FileUploadException e) {
            request.setAttribute("message", "There were errors during the upload: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            request.setAttribute("message", "There were errors during the upload: " + e.getMessage());
            e.printStackTrace();
        }
        request.getRequestDispatcher("/uploadPage.jsp").forward(request, response);
    }

}