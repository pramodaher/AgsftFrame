package com.agsft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.dto.EmployeeDto;
import com.agsft.service.EmployeeService;
import com.agsft.util.Response;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService  employeeService;
	
	@GetMapping(
			path = {"/employee"},
			produces = {MediaType.APPLICATION_JSON_VALUE}
			)
	public ResponseEntity<?> getEmployee(){	
		List<EmployeeDto> employeeList=employeeService.getEmployee();
		return ResponseEntity.ok(new Response(true, 200, "Employee Recored fatch sucesfully", employeeList));
	}
	
	
	@PostMapping(
			path = {"/add-employee"},
			consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE},
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto employeeDto){
		employeeService.saveEmployee(employeeDto);
		return ResponseEntity.ok(new Response(true, 200, "Employee Recored save sucesfully", null));
	}

}
