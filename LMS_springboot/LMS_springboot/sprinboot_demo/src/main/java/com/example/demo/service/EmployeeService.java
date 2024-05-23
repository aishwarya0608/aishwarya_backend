package com.example.demo.service;

import com.example.demo.dto.AddressDetailsListDto;
import com.example.demo.dto.ContactListDto;
import com.example.demo.dto.EducationDetailsListDto;
import com.example.demo.dto.EmployeeBankDetailsDto;
import com.example.demo.dto.EmployeeExperienceDto;
import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeSecondaryInfoDto;
import com.example.demo.dto.ExperienceListDto;
import com.example.demo.dto.TechnicalSkillsListDto;

public interface EmployeeService {
	
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);
	
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);
	
	public String saveBankDetails(EmployeeBankDetailsDto dto);

	public String saveEducationDetails(EducationDetailsListDto dto);
	
	public String saveAddressDetails(AddressDetailsListDto dto);
	
	public String saveExperience(ExperienceListDto dto);

	public String saveContact(ContactListDto dto);
	
	public String saveTechnicalSkills(TechnicalSkillsListDto dto);
}
