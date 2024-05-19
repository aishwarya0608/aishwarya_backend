package com.example.demo.dto;

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
public class EmployeeTechnicalSkillsDto {

	private Integer id;

	private String skillType;

	private String skillRating;

	private String yearOfExperience;
	
}
