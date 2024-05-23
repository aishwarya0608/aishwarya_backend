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


	public class EmployeeExperienceDto {

		
		private Integer id;

		private String yearsOfExperience;

		private String dateOfJoining;

		private String dateOfRelieving;

		private String designation;

		private String location;
	}
