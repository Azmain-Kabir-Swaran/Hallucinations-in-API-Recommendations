package org.example;


import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;

public class Main {
    public static void main(String[] args) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://www.example.com").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
            builder.addPart("image", new FileBody(new File("C:\\temp\\image.jpg")));
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ builder.getDefaultHttpMultipart().getContentType().getValue());

            OutputStream outputStream = httpURLConnection.getOutputStream();
            builder.build().writeTo(outputStream);
            outputStream.close();

            int responseCode = httpURLConnection.getResponseCode();
            if(responseCode == HttpURLConnection.HTTP_CREATED) {
                System.out.println("Image uploaded successfully.");
            } else {
                System.out.println("Unable to upload image. Error code: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}