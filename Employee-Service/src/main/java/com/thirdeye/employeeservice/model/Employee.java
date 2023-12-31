package com.thirdeye.employeeservice.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Employee")
public class Employee {
	@Id
	private String id;
	
	private String empId;
	
	private String name;
	
	private LocalDate dob;
	
	private List<Address> address;
	
	private List<Contact> contact;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
}
