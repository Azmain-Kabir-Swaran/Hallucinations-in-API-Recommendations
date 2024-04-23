package org.example;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "https://example.com";
        File file = new File("file.txt");

        // creates HttpClient
        CloseableHttpClient httpclient = HttpClients.createDefault();

        // creates an HttpPost object
        HttpPost httppost = new HttpPost(url);

        // creates a multipart form using HttpClient's factory method
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

        // adds binary data part
        builder.addBinaryBody("file", file, ContentType.APPLICATION_OCTET_STREAM, file.getName());

        // adds the resulting multipart/form-data to the post
        httppost.setEntity(builder.build());

        // sends a POST request to the specified URL and returns response
        CloseableHttpResponse response = httpclient.execute(httppost);
        try {
            HttpEntity entity = response.getEntity();

            System.out.println("Status: " + response.getStatusLine().getStatusCode());
            System.out.println(EntityUtils.toString(entity));
        } finally {
            response.close();
        }
    }
}