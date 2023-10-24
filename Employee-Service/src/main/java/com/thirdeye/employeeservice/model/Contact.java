package com.thirdeye.employeeservice.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	
	private String contactType;
	
	private String contactValue;
	
	private LocalDate createdAt;
	
	private LocalDate updatedAt;
	

}
