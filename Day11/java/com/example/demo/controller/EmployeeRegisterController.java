package com.example.demo.controller;
import static com.example.demo.constant.EmployeeConstants.EMPLOYEE_PRIMARY_INFO_SAVED;
import static  com.example.demo.constant.EmployeeConstants.EMPLOYEE_SECONDARY_INFO_SAVED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeSecondaryInfoDto;
import com.example.demo.response.CommonResponse;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(path="/api/v1/employee")

public class EmployeeRegisterController {
 
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/primaryinfo")
	public ResponseEntity<CommonResponse> 
	addEmployeePrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto){
		String employeeId = employeeService.savePrimaryInfo(dto);
		
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_PRIMARY_INFO_SAVED).build());		
		
	}
	
	public ResponseEntity<CommonResponse<String>> addEmployeeSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto) {
		String employeeId = employeeService.saveSecondaryInfo(dto);	
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_SECONDARY_INFO_SAVED).build());
	}

	
	
}
