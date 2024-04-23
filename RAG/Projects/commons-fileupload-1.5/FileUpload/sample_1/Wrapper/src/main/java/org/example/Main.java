package org.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.httpHttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Main extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  // Where files will be stored.
  private static final String UPLOAD_DIRECTORY = "upload";
  
  /**
   * Handle the file upload
   */
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    DiskFileItemFactory factory = new DiskFileItemFactory();
    // maximum size that will be stored in memory
    factory.setSizeThreshold(1024 * 1024);
    // maximum file size to be uploaded
    factory.setRepository(new File("c:\\temp"));
    
    ServletFileUpload upload = new ServletFileUpload(factory);
    upload.setSizeMax(1024 * 1024 * 10); // 10M

    try {
      // Parse the request to get file items.
      List<FileItem> fileItems = upload.parseRequest(request);
      if (fileItems != null && fileItems.size() > 0) {
        // iterate over the file items
        for (FileItem item : fileItems) {
          // process only if the item is not null and a file
          if (item != null && item.getName() != null && item.getName() != "") {
            String fileName = new File(item.getName()).getName();
            String filePath = UPLOAD_DIRECTORY + File.separator + fileName;
            // save the file
            File uploadedFile = new File(filePath);
            item.write(uploadedFile);
          }
        }
      }
    } catch (FileUploadException ex) {
      ex.printStackTrace();
    }
  }
}