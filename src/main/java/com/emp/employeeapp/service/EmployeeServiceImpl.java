package com.emp.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employeeapp.entity.Employee;
import com.emp.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements Employeeservice {

	@Autowired
	private EmployeeRepository emprepo;

	@Override
	public Employee createEmployee(Employee employee) {
		return emprepo.createEmployee(employee);
	}
	
	
	
}
