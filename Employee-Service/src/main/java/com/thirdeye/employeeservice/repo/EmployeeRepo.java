package com.thirdeye.employeeservice.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thirdeye.employeeservice.model.Employee;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{
	
	Optional<Employee> findByEmpId(String id);

}
