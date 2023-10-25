package com.thirdeye.employeeservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdeye.employeeservice.dto.EmployeeRequestDTO;
import com.thirdeye.employeeservice.model.Employee;
import com.thirdeye.employeeservice.service.EmployeeService;
import com.thirdeye.employeeservice.util.EmployeeServiceUtil;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService serv;
	@Autowired
	private EmployeeServiceUtil util;
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Optional<Employee>> findOne (@PathVariable String id){
//		 Optional<Employee> findOne = serv.findOne(id);	
		Optional<Employee> findByEmpId = util.findByEmpId(id);
		 return new ResponseEntity<Optional<Employee>>(findByEmpId, HttpStatus.OK);
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<Employee>> findAll (){
		List<Employee> findOne = serv.findAll();		
		 return new ResponseEntity<List<Employee>>(findOne, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> create (@RequestBody EmployeeRequestDTO dto){
		String created = serv.create(dto);
		return new ResponseEntity<String>(created, HttpStatus.CREATED);		
	}
}
