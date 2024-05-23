package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.enums.BloodGroup;
import com.example.demo.enums.EmployeeDesignation;
import com.example.demo.enums.EmployeeStatus;
import com.example.demo.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="employee_primary_info")
public class EmployeePrimaryInfo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
    @Column(unique = true)
	private String employeeId;
	private String employeeName;
	private String dateOfJoining;
	private String dateOfBirth;
	private String emaild;
	
	//@Enumerated(EnumType.STRING)
	private String  bloodGroup;
	
	@Enumerated(EnumType.STRING)
	private EmployeeDesignation employeeDesignation;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String nationality;
	
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeestatus;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeEducationDetails> employeeeducationDetails;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<AddressDetails> addressDetails;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeExperience> employeeExperience;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private EmployeeBankDetails employeeBankDetails;
	
	@OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeContactDetails> employeeContactDetails;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private EmployeeSecondaryInfo employeeSecondaryInfo;
	
	@ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeTechnicalSkills> employeeTechnicalSkills;

	
		
}
