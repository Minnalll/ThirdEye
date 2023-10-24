package com.thirdeye.employeeservice.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String mongoId;
	
	private String empId;
	
	private String name;
	
	private LocalDate dob;
	
	private List<Address> address;
	
	private List<Contact> contact;
	
	private LocalDate createdAt;
	
	private LocalDate updatedAt;
}
