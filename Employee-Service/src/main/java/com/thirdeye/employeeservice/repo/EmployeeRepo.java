package com.thirdeye.employeeservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thirdeye.employeeservice.model.Employee;
@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{

}
