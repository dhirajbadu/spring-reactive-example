package com.upwork.reactive.controller;

import com.upwork.reactive.client.EmployeeClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeClient employeeClient;

    @GetMapping("/getEmployeeList")
    public Mono<List> getEmployees(){
        return employeeClient.getEmployees();

    }
}
