package org.example;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import java.io.File;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Set up a factory
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // Set up a properties to simulate a form's submitted data
        Properties properties = new Properties();
        // If there's a larger file than this in the request, fail
        properties.put("sizeLimit", "10000"); //10000 bytes == 10K

        // Use the factory to construct an itemfactory
        factory.setSizeThreshold(10000); //10K

        // Create a file repository (to allow temp files)
        File repository = new File("D:\\Temp");
        factory.setRepository(repository);

        // Create a new file upload handler
        FileUploadHandler handler = new FileUploadHandler(factory, properties);

        try {
            // Parse the request
            List<FileItem> items = handler.parseRequest(request);

            // Process the items
            for (FileItem item : items) {
                if (item.isFormField()) {
                    // Process form fields
                } else {
                    // Process file uploads
                    String fieldName = item.getFieldName();
                    String fileName = item.getName();
                    long sizeInBytes = item.getSize();
                    String contentType = item.getContentType();

                    // You can get the input stream via item.getInputStream()
                }
            }
        } catch (FileUploadBase.FileSizeLimitExceededException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}