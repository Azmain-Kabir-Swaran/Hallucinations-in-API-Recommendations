package org.example;


import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        WebClient client = WebClient.create("https://httpbin.org");
        Mono<String> result = client.method(HttpMethod.GET)
                .uri("/get")
                .retrieve()
                .bodyToMono(String.class);
        System.out.println(result.block());
    }
}