package com.upwork.reactive.client;

import com.upwork.reactive.model.EmployeeDTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class EmployeeClient {

    public Mono<List> getEmployees() {
        WebClient client = WebClient.create("http://localhost:8080");
        return client.get().uri("/getEmployees").accept(MediaType.ALL)
                .header("Content-Type", "application/json;charset=UTF-8")
                .retrieve()
                .bodyToMono(List.class);
    }
}
