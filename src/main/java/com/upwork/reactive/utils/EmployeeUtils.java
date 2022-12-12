package com.upwork.reactive.utils;

import com.upwork.reactive.model.EmployeeDTO;

import java.util.List;

public class EmployeeUtils {

    private static final List<EmployeeDTO> employeeDTOList = List.of(
            new EmployeeDTO("Employee1"),
            new EmployeeDTO("Employee2"),
            new EmployeeDTO("Employee3"),
            new EmployeeDTO("Employee4"),
            new EmployeeDTO("Employee5")
    );

    public static List<EmployeeDTO> getEmployeeList(){
        return employeeDTOList;
    }
}
