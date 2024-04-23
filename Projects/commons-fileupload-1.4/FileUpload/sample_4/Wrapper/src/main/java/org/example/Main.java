package org.example;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.*;
import java.io.*;

public class Main extends HttpServlet {
  
    private boolean isMultipartContent(HttpServletRequest request) {
        String contentType = request.getContentType();
        return contentType != null && contentType.toLowerCase().startsWith("multipart/form-data");
    }

    private File convert(FileItem fi) throws Exception {
        File f = new File(getServletContext().getRealPath("/") + File.separator + "uploads" + File.separator + fi.getName());
        fi.write(f);
        return f;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        upload.setSizeMax(100000);

        try {
            if(isMultipartContent(request)) {
                List fileItems = upload.parseRequest(request);

                Iterator i = fileItems.iterator();
                while (i.hasNext()) {
                    FileItem fi = (FileItem) i.next();
                    if (!fi.isFormField()) {
                        File uploadedFile = convert(fi);
                        response.setContentType("text/html");
                        PrintWriter out = response.getWriter();
                        out.println("<h3>File " + uploadedFile.getName() + " uploaded successfully.</h3>");
                    }
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}