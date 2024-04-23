package org.example;


import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a HTTP client
        CloseableHttpClient client = HttpClients.createDefault();

        // Create the http post
        HttpPost httpPost = new HttpPost("http://www.example.com");

        // Adding some headers
        httpPost.setHeader("User-Agent", "HttpComponents/1.1");

        // Create the parameters
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("username", "user"));
        parameters.add(new BasicNameValuePair("password", "password"));

        // Attach the parameters to the post
        httpPost.setEntity(new UrlEncodedFormEntity(parameters));

        // Create a multipart entity
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);

        // Adding some more parameters
        parameters.add(new BasicNameValuePair("param1", "value1"));
        parameters.add(new BasicNameValuePair("param2", "value2"));

        // Create a string body
        StringBody body = new StringBody("String content", ContentType.TEXT_PLAIN);

        // Adding the body to the builder
        builder.addPart("name", body);

        // Attach the multipart entity to the post
        httpPost.setEntity(builder.build());

        // Execute the post
        try (CloseableHttpResponse response = client.execute(httpPost)) {
            HttpEntity entity = response.getEntity();
            // TODO: Do something with the response entity
        }
    }
}