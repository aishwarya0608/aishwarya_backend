package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder



public class EmployeeContactDetailsDto {

	private Integer id;

	private String contactType;

	private String contactNumber;
	
}
