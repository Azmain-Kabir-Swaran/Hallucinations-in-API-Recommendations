package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet:sax.InputSource;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int THRESHOLD_SIZE = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

    /**
     * handles file upload from clients
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // checks if the request actually contains upload part
        boolean isMultipart = ServletRequest.isMultipartContent(request);

        // If not a multipart/form-data request, give proper response
        if (!isMultipart) {
            return;
        }

        // configures file upload settings
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // maximum size that will be stored (use -1 for unlimited)
        factory.setSizeThreshold(THRESHOLD_SIZE);

        // location where files will be stored
        factory.setRepository(new File("c:\\temp"));

        ServletFileUpload upload = new ServletFileUpload(factory);

        // maximum file size to be uploaded
        upload.setSizeMax(MAX_FILE_SIZE);

        // maximum size of the request (use -1 for unlimited)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        try {
            // parses the request passed as parameter
            List<FileItem> items = upload.parseRequest(request);

            // iterates over the file items
            for (FileItem item : items) {
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    item.write(new File("c:\\temp\\" + fileName));
                    request.setAttribute("message", "Upload has been done successfully!");
                }
            }
        } catch (FileUploadException e) {
            request.setAttribute("message", "Upload failed due to getFileItems() exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            request.setAttribute("message", "Upload failed due to exception: " + e.getMessage());
            e.printStackTrace();
        }

        // redirects to the message page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/message.jsp");
        dispatcher.forward(request, response);
    }

    ...
}