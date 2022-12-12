package com.upwork.reactive;

import com.upwork.reactive.client.EmployeeClient;
import com.upwork.reactive.model.EmployeeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = ReactiveApplication.class)
class ReactiveApplicationTests {

	@Autowired
	private EmployeeClient employeeClient;

	@Test
	void getEmployeesFromClient() throws Exception {
		List data = employeeClient.getEmployees().block();
		System.out.println(data.size());
		Assertions.assertEquals(5, data.size());
	}

	@Test
	void getEmployeesApi() throws Exception {
		RestTemplate restTemplate = new RestTemplateBuilder().rootUri("http://localhost:8080").build();
		List<EmployeeDTO> data = restTemplate.getForEntity("/getEmployeeList", new ArrayList<EmployeeDTO>().getClass()).getBody();
		Assertions.assertNotNull(data);
		Assertions.assertEquals(5, data.size());
	}


}
