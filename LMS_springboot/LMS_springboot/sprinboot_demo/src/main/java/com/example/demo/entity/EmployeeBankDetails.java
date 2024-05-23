package com.example.demo.entity;

import java.time.LocalDate;

import com.example.demo.enums.AccountType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_bank_info")
@Builder
public class EmployeeBankDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(unique = true)
	private String accountNumber;
	private String bankName;
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
	
	@JoinColumn(name="employee_id")
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
	

