package org.example;


import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            String url = "https://example.com/path";

            // Create HTTP POST request
            HttpPost httpPost = new HttpPost(url);

            // Add multipart/form-data entity
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

            // Add text data
            StringBody stringBody = new StringBody("Data", ContentType.TEXT_PLAIN);
            builder.addPart("text", stringBody);

            // Add file data
            // You need to add the file data here. An example for file name "example.txt" can be:
            // ContentType contentType = ContentType.create("text/plain", Consts.ASCII);
            // FileBody fileBody = new FileBody(new File("example.txt"), contentType);
            // builder.addPart("file", fileBody);

            // Add name-value pairs
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("key1", "value1"));
            nameValuePairs.add(new BasicNameValuePair("key2", "value2"));
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            // Execute the request
            try (CloseableHttpClient httpClient = HttpClients.createDefault();
                 CloseableHttpResponse response = httpClient.execute(httpPost)) {
                // Do something with the response...
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}