package org.example;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.springframework.web.util.UriComponentsBuilder;

public class Main {

    public static void main(String[] args) {
        String baseUrl = "http://example.com";

        // Use UriComponentsBuilder to build a URI
        String builtUri = UriComponentsBuilder.fromUriString(baseUrl)
                .queryParam("name", "John")
                .queryParam("age", 30)
                .build()
                .toUriString();

        System.out.println("Built URI: " + builtUri);

        // Use Date, SimpleDateFormat, Calendar, and TimeZone API for other functionality
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Date in New York: " + sdf.format(calendar.getTime()));
    }

}