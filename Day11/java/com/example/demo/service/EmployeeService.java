package com.example.demo.service;

import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeSecondaryInfoDto;

public interface EmployeeService {
	
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);
	
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);
	

}
