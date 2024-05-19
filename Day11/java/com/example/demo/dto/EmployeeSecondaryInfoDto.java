package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSecondaryInfoDto {
	
	private String employeeId;
    private Integer id;
	private Integer panNumber;
	private Integer aadharNumber;
	private String motherName;
	private String fathernName;
	private String spouseName;
	private String passportNumber;
	private String maritalStatus;
}
