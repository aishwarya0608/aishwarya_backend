package com.example.demo.entity;

import java.time.LocalDate;
import lombok.Builder;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_contact_info")
@Builder
public class EmployeeContactDetails {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String contactType;
	private String contactNumber;
	
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
