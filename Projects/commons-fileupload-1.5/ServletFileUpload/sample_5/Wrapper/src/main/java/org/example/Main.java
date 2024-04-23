package org.example;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadPath = getServletContext().getRealPath("/") + "UploadedFiles";
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload uploadHandler = new ServletFileUpload(factory);

        try {
            List<FileItem> items = uploadHandler.parseRequest(request);
            FileItem item;

            for (int i = 0; i < items.size(); i++) {
                item = items.get(i);
                if (item.isFormField()) {
                    // Process the form field here, such as item.getFieldName() and item.getString()
                } else {
                    // The file upload starts here, process the file here
                    String fileName = new File(item.getName()).getName();
                    File file = new File(uploadPath + File.separator + fileName);
                    item.write(file);
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
}