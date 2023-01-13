package com.huseyinaydin.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.huseyinaydin.dto.EmployeeDTO;
import com.huseyinaydin.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Employee asEntity(EmployeeDTO dto);
}