package org.example;

import java.util.concurrent.TimeUnit;
import org.awaitility.Awaitility;
import org.junit.Test;
import static org.awaitility.Durations.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpStatus;

public class Main {
    
    @Test
    public void testWait() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/ping"; // replace with your WebService under test url

        Awaitility.await().atMost(2, TimeUnit.SECONDS).pollInterval(100, TimeUnit.MILLISECONDS)
                .untilAsserted(() -> {
                    HttpStatus status = restTemplate.getForObject(url, HttpStatus.class);
                    // check the status of the service here
                    assert status.equals(HttpStatus.OK); // replace with your desired status or condition
                });
    }
}