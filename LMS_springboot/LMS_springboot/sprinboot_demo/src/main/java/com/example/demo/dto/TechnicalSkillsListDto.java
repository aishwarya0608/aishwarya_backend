package com.example.demo.dto;

import java.util.List;

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


public class TechnicalSkillsListDto {
	
	private String employeeId;
	List<EmployeeTechnicalSkillsDto> skills;
}