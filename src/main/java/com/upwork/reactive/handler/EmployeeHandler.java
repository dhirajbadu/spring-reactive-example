package com.upwork.reactive.handler;

import com.upwork.reactive.utils.EmployeeUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Service
public class EmployeeHandler {

    public Mono<ServerResponse> getEmployees(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(EmployeeUtils.getEmployeeList()));
    }
}
