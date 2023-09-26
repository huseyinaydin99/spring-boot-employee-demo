package com.huseyinaydin.util;

import java.util.Arrays;
import java.util.List;

import com.huseyinaydin.dto.EmployeeDTO;
import com.huseyinaydin.entity.Employee;

public class EmployeeBuilder {

    public static List<EmployeeDTO> getListDTO() {
        return Arrays.asList(new EmployeeDTO(1,"Huseyin","DEV",50000),
                new EmployeeDTO(2,"Niğde","QA",80000));
    }

    public static List<Employee> getListEntities() {
        return Arrays.asList(new Employee(1,"Huseyin","DEV",50000),
                new Employee(2,"Niğde","QA",80000));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(1,"Huseyin","DEV",50000);
    }

    public static Employee getEntity() {
        return new Employee(1,"Huseyin","DEV",50000);
    }
}
