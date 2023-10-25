package com.thirdeye.employeeservice.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.thirdeye.employeeservice.dto.AddressRequestDTO;
import com.thirdeye.employeeservice.dto.EmployeeRequestDTO;
import com.thirdeye.employeeservice.exception.BadRequest;
import com.thirdeye.employeeservice.exception.ResourceNotFoundException;
import com.thirdeye.employeeservice.model.Address;
import com.thirdeye.employeeservice.model.Employee;
import com.thirdeye.employeeservice.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public Optional<Employee> findOne(String id) {
		Optional<Employee> findById = repo.findById(id);		
		return findById;
	}

	public List<Employee> findAll() {
		List<Employee> findAll = repo.findAll();
		if (findAll.isEmpty()) {
			throw new ResourceNotFoundException("Employee list is empty");
		}
		return findAll;
	}

	public String create(EmployeeRequestDTO dto) {
		try {
			Employee empl = new Employee();
			BeanUtils.copyProperties(dto, empl);
			empl.setCreatedAt(LocalDateTime.now());
			Employee saved = repo.save(empl);
			return "Employee saved to DB with ID : " + saved.getEmpId();
		} catch (Exception e) {
			throw new BadRequest("Bad Request... Please try again");
		}		
	}
	
	

}
