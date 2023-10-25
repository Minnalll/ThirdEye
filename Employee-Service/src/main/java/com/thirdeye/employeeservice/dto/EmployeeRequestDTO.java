package com.thirdeye.employeeservice.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.thirdeye.employeeservice.model.Address;
import com.thirdeye.employeeservice.model.Contact;
import com.thirdeye.employeeservice.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDTO {
	
	@Id
	private String id;
	
	private String empId;
	
	private String name;
	
	private LocalDate dob;
	
	private List<Address> address;
	
	private List<Contact> contact;
	
//	private LocalDate createdAt;
//	
//	private LocalDate updatedAt;
	
}
