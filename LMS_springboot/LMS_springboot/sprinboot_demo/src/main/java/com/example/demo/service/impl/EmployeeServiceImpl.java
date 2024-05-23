package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AddressDetailsListDto;
import com.example.demo.dto.ContactListDto;
import com.example.demo.dto.EducationDetailsListDto;
import com.example.demo.dto.EmployeeBankDetailsDto;
import com.example.demo.dto.EmployeeExperienceDto;
import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeSecondaryInfoDto;
import com.example.demo.dto.ExperienceListDto;
import com.example.demo.dto.TechnicalSkillsListDto;
import com.example.demo.entity.AddressDetails;
import com.example.demo.entity.EmployeeBankDetails;
import com.example.demo.entity.EmployeeContactDetails;
import com.example.demo.entity.EmployeeEducationDetails;
import com.example.demo.entity.EmployeeExperience;
import com.example.demo.entity.EmployeePrimaryInfo;
import com.example.demo.entity.EmployeeSecondaryInfo;
import com.example.demo.entity.EmployeeTechnicalSkills;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.TechnicalSkillsRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.utils.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	private TechnicalSkillsRepository skillsRepository;

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
		if(optionalEmployees.isPresent())
		{
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			if(primaryInfo.getEmployeeSecondaryInfo()==null) 
			{
				EmployeeSecondaryInfo secondaryInfo	= EmployeeSecondaryInfo.builder().panNumber(dto.getPanNumber()).
				aadharNumber(dto.getAadharNumber()).fathernName(dto.getFathernName()).motherName(dto.getMotherName())
				.spouseName(dto.getSpouseName()).passportNumber(dto.getPassportNumber()).maritalStatus(dto.getMaritalStatus()).build();
				
				primaryInfo.setEmployeeSecondaryInfo(secondaryInfo);
				secondaryInfo.setEmployeePrimaryInfo(primaryInfo);
				
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
			else
			{
				primaryInfo.getEmployeeSecondaryInfo().getId();
				EmployeeSecondaryInfo.builder().panNumber(dto.getPanNumber()).aadharNumber(dto.getAadharNumber()).fathernName(dto.getFathernName())
				.motherName(dto.getMotherName()).spouseName(dto.getSpouseName()).passportNumber(dto.getPassportNumber())
				.maritalStatus(dto.getMaritalStatus()).build();
				
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
		}
			return "Employee not found";
		
	}
	@Override
	public String saveEducationDetails(EducationDetailsListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<EmployeeEducationDetails> educationDetails = EmployeeUtils.educationDtoToEntities(dto.getEducation());
		}
		return null;
	}
	
	
	@Override
	public String saveAddressDetails(AddressDetailsListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());//error
		if (optional.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optional.get();
			List<AddressDetails> addressDetails = EmployeeUtils.addressDtoToEntities(dto.getAddresses()); //error
			primaryInfo.setAddressDetails(addressDetails);
			addressDetails.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
			return employeeRepository.save(primaryInfo).getEmployeeId();
		}
		return null;
}

	
	@Override
	public String saveBankDetails(EmployeeBankDetailsDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optionalEmployees.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			if (primaryInfo.getEmployeeBankDetails() == null) {
				EmployeeBankDetails bankDetails = EmployeeBankDetails.builder().accountType(dto.getAccountType())
						.accountNumber(dto.getAccountNumber()).bankName(dto.getBankName()).ifscCode(dto.getIfscCode())
						.branch(dto.getBranch()).state(dto.getState()).build();
				primaryInfo.setEmployeeBankDetails(bankDetails);
				bankDetails.setEmployeePrimaryInfo(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			} else {
				primaryInfo.getEmployeeBankDetails().getId();
				EmployeeBankDetails.builder().accountNumber(dto.getAccountNumber()).accountType(dto.getAccountType())
						.bankName(dto.getBankName()).branch(dto.getBranch()).ifscCode(dto.getIfscCode())
						.state(dto.getState()).build();
				return employeeRepository.save(primaryInfo).getEmployeeId();

			}
		}
		
		return "Employee not found";
	}

@Override
public String saveExperience(ExperienceListDto dto) {
	Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
	if (optional.isPresent()) {
		EmployeePrimaryInfo primaryInfo = optional.get();
		List<EmployeeExperience> experience = EmployeeUtils.experienceDtoToEntities(dto.getExperience());
		primaryInfo.setEmployeeExperience(experience);
		experience.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
		return employeeRepository.save(primaryInfo).getEmployeeId();
	}
	return null;
}

@Override
public String saveContact(ContactListDto dto) {
	Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
	if (optional.isPresent()) {
		EmployeePrimaryInfo primaryInfo = optional.get();
		List<EmployeeContactDetails> contact = EmployeeUtils.contactDtoToEntity(dto.getContacts());
		primaryInfo.setEmployeeContactDetails(contact);
		contact.stream().forEach(x -> x.setEmployeePrimaryInfo(primaryInfo));
		return employeeRepository.save(primaryInfo).getEmployeeId();
	}
	return null;
}
	
	@Override
	public String saveTechnicalSkills(TechnicalSkillsListDto dto) {
		Optional<EmployeePrimaryInfo> optionalEmployees = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optionalEmployees.isPresent()) {
			EmployeePrimaryInfo primaryInfo = optionalEmployees.get();
			List<EmployeeTechnicalSkills> skills =dto.getSkills().stream().map(skill ->{
				Optional<EmployeeTechnicalSkills> optional = skillsRepository
						.findBySkillTypeAndSkillRatingAndYearOfExperience(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfExperience());
				return optional.isPresent()?optional.get():EmployeeUtils.dtoToEntity(skill);

			}).collect(Collectors.toList());
			
			if(primaryInfo.getEmployeeTechnicalSkills() != null) {
				primaryInfo.getEmployeeTechnicalSkills().clear();
			}
			skills.stream().forEach(x ->{
				if(!x.getEmployeePrimaryInfo().contains(primaryInfo))
					x.getEmployeePrimaryInfo().add(primaryInfo);
			});
			primaryInfo.setEmployeeTechnicalSkills(skills);
			employeeRepository.save(primaryInfo);
			return primaryInfo.getEmployeeId();

		}
		return null;
	}
}

	
	