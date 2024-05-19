package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeSecondaryInfoDto;
import com.example.demo.entity.EmployeePrimaryInfo;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.utils.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto)
	{
		
		
		if(!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) 
		{
			EmployeePrimaryInfo primaryInfo =EmployeeUtils.employeeDtoToEntity(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();
			
		}
		return null;
		
	}
	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees =employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		
		return null;
	}

	
}
