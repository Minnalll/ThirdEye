package com.thirdeye.employeeservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactRequestDTO {
	
	private String contactType;
	
	private String contactValue;
	
//	private LocalDateTime createdAt;
//	
//	private LocalDateTime updatedAt;
	
}
