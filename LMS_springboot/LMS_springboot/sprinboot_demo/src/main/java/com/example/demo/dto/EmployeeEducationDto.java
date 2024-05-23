package com.example.demo.dto;

import java.time.LocalDate;

import com.example.demo.enums.EducationType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEducationDto {

	
	private Integer id;
	private EducationType educationType;
	private String yearOfPassing;
	private String percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;
}
