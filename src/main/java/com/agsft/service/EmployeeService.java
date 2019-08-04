package com.agsft.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agsft.domain.Employee;
import com.agsft.dto.EmployeeDto;
import com.agsft.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ModelMapper modelMapper;

	public List<EmployeeDto> getEmployee() {
		


		List<Employee> employees = employeeRepository.findAll();
		List<EmployeeDto> employeeList = new ArrayList<>();

		employees.forEach(employee -> {
			employeeList.add(modelMapper.map(employee, EmployeeDto.class));
		});

		int a=1;
		return employeeList;

	}

}
