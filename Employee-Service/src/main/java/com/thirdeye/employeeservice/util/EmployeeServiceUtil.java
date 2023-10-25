package com.thirdeye.employeeservice.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thirdeye.employeeservice.exception.ResourceNotFoundException;
import com.thirdeye.employeeservice.model.Employee;
import com.thirdeye.employeeservice.repo.EmployeeRepo;

@Component
public class EmployeeServiceUtil {
	@Autowired
	private EmployeeRepo repo;
	
	public Optional<Employee> findByEmpId(String id){
		Optional<Employee> findByEmpId = repo.findByEmpId(id);
		if (!findByEmpId.isEmpty()) {
			return findByEmpId;
		}
		throw new ResourceNotFoundException("Employee not found with Id : " + id);		
	}

}
