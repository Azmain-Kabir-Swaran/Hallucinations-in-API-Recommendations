package org.example;

import java.io.File;
import java.io.IOException;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commonsfileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sf = new ServletFileUpload(factory);
        sf.setSizeMax(100000);  // restrict max size of uploaded files to 100k bytes.

        try {
            List<FileItem> items = sf.parseRequest(req);
            for (FileItem item : items) {
                // if FileItem is file (if false then it is field)
                if (!item.isFormField()){
                    // get file name and store it
                    String fileName = item.getName();
                    File uploadedFile = new File("/path/where/you/want/to/save/" + fileName);
                    item.write(uploadedFile);

                    // read the uploaded file and print its content
                    BufferedReader br = new BufferedReader(new FileReader(uploadedFile));
                    String line;
                    while ((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                    br.close();
                }
            }
        } catch (FileUploadException e) {
            // handle exception properly in real world application
            System.out.println("FileUploadException");
            e.printStackTrace();
        } catch (Exception e) {
            // handle exception properly in real world application
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}