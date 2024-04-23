package org.example;


import javax.servlet.MultipartConfigElement;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        MultipartConfigElement multipartConfigElement = new MultipartConfigElement("/tmp");

        // Fake the Part object, we should use it as received from the Servlet
        // Here we create a part using a fake file content
        Part part = new Part() {
            @Override
            public InputStream getInputStream() throws IOException {
                // Implement the logic to return the file input stream
                return null;
            }

            @Override
            public String getContentType() {
                // Implement the logic to return the file content type
                return null;
            }

            @Override
            public String getName() {
                // Implement the logic to return the file name
                return null;
            }

            @Override
            public String getSubmittedFileName() {
                // Implement the logic to return the file name submitted by the client
                return null;
            }

            @Override
            public long getSize() {
                // Implement the logic to return the file size
                return -1;
            }

            @Override
            public void write(String s) throws IOException {
                // Implement the logic to write data to the part
            }

            @Override
            public void delete() {
                // Implement the logic to delete the part
            }

            @Override
            public String getHeader(String s) {
                // Implement the logic to get the header value of the part
                return null;
            }
        };

        String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
        try (InputStream input = part.getInputStream();
             OutputStream output = Files.newOutputStream(Paths.get("/path/to/destination/directory", fileName), StandardCopyOption.REPLACE_EXISTING)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}