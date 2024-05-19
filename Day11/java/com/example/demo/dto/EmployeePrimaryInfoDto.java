package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.enums.BloodGroup;
import com.example.demo.enums.EmployeeDesignation;
import com.example.demo.enums.EmployeeStatus;
import com.example.demo.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

public class EmployeePrimaryInfoDto {

    private Integer id;
    
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	private String emaild;
	private String  bloodGroup;
	private EmployeeDesignation employeeDesignation;
	private Gender gender;
	private String nationality;
	private EmployeeStatus employeestatus;
	
}

