package com.emp.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeeapp.entity.Employee;
import com.emp.employeeapp.service.Employeeservice;

@RestController
public class EmployeeController {

	@Autowired
	private Employeeservice empservice;
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee){
		
		employee = empservice.createEmployee(employee);
		return new ResponseEntity<>(
				"Employee is created successfully with Id="+employee.getId(),HttpStatus.CREATED);
	}
}
