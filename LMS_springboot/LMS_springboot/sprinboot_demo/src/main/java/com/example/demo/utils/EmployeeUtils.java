package com.example.demo.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.example.demo.dto.AddressDetailsDto;
import com.example.demo.dto.EmployeeContactDetailsDto;
import com.example.demo.dto.EmployeeEducationDto;
import com.example.demo.dto.EmployeeExperienceDto;
import com.example.demo.dto.EmployeePrimaryInfoDto;
import com.example.demo.dto.EmployeeTechnicalSkillsDto;
import com.example.demo.entity.AddressDetails;
import com.example.demo.entity.EmployeeContactDetails;
import com.example.demo.entity.EmployeeEducationDetails;
import com.example.demo.entity.EmployeeExperience;
import com.example.demo.entity.EmployeePrimaryInfo;
import com.example.demo.entity.EmployeeTechnicalSkills;

public class EmployeeUtils {

	private EmployeeUtils() {
	}

	public static EmployeePrimaryInfo employeeDtoToEntity(EmployeePrimaryInfoDto dto) {
		return EmployeePrimaryInfo.builder().id(dto.getId()).employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName()).dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth()).emaild(dto.getEmaild()).bloodGroup(dto.getBloodGroup())
				.employeeDesignation(dto.getEmployeeDesignation()).gender(dto.getGender())
				.nationality(dto.getNationality()).employeestatus(dto.getEmployeestatus()).build();
	}

	public static List<EmployeeEducationDetails> educationDtoToEntities(List<EmployeeEducationDto> dtoList) {

		return dtoList.stream()
				.map(e -> EmployeeEducationDetails.builder().yearOfPassing(e.getYearOfPassing())
						.educationType(e.getEducationType()).specialization(e.getSpecialization())
						.instituteName(e.getInstituteName()).percentage(e.getPercentage()).state(e.getState())
						.universityName(e.getUniversityName()).build())
				.collect(Collectors.toList());
	}

	public static List<AddressDetails> addressDtoToEntities(List<AddressDetailsDto> addresses) {
		return addresses.stream()
				.map(add -> AddressDetails.builder().addressType(add.getAddressType()).doorNumber(add.getDoorNumber())
						.locality(add.getLocality()).street(add.getStreet()).city(add.getCity())
						.pincode(add.getPincode()).state(add.getState()).landmark(add.getLandmark()).build())
				.collect(Collectors.toList());
	}

	public static List<EmployeeExperience> experienceDtoToEntities(List<EmployeeExperienceDto> experiences) {
		return experiences.stream()
				.map(exp -> EmployeeExperience.builder().companyName(exp.getCompanyName()).dateOfJoining(exp.getDateOfJoining())
						.dateOfRelieving(exp.getDateOfRelieving()).designation(exp.getDesignation()).yearOfExperience(exp.getYearsOfExperience())
						.build())
				.collect(Collectors.toList());
	}

	public static List<EmployeeContactDetails> contactDtoToEntity(List<EmployeeContactDetailsDto> contacts) {
		return contacts.stream().map(contact -> EmployeeContactDetails.builder()
				.contactNumber(contact.getContactNumber()).contactType(contact.getContactType()).build())
				.collect(Collectors.toList());
	}

	public static EmployeeTechnicalSkills dtoToEntity(EmployeeTechnicalSkillsDto skill) {
		return EmployeeTechnicalSkills.builder().skillType(skill.getSkillType()).skillRating(skill.getSkillRating())
				.yearOfExperience(skill.getYearOfExperience()).employeePrimaryInfo(new ArrayList<>()).build();
	}

}
