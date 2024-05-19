package com.example.demo.utils;

import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.entity.EmployeePrimaryInfo;

public class EmployeeUtils {

private EmployeeUtils() {
		
	}
	
	public static EmployeePrimaryInfo employeeDtoToEntity(EmployeePrimaryInfoDto dto) {
		return EmployeePrimaryInfo.builder().id(dto.getId())
				.employeeId(dto.getEmployeeId()).employeeName(dto.getEmployeeName())
				.dateOfJoining(dto.getDateOfJoining()).dateOfBirth(dto.getDateOfBirth())
				.emaild(dto.getEmaild()).bloodGroup(dto.getBloodGroup())
				.employeeDesignation(dto.getEmployeeDesignation()).gender(dto.getGender())
				.nationality(dto.getNationality()).employeestatus(dto.getEmployeestatus()).build();
}
}
