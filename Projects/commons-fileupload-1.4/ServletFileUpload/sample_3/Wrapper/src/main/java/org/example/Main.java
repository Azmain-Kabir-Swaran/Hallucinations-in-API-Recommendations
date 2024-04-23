package org.example;

import java.io.File;
import java.ioimport javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.httpimport org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Main() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(1000000);
        
        try {
            List<FileItem> items = upload.parseRequest(request);
            for(FileItem item : items) {
                if(!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    String filePath = "/path/to/upload/directory/" + fileName;
                    File uploadedFile = new File(filePath);
                    item.write(uploadedFile);
                    request.setAttribute("message", "File uploaded successfully");
                }
            }
        } catch (Exception ex) {
            request.setAttribute("message", "There was an error: " + ex.getMessage());
        }
    }
}