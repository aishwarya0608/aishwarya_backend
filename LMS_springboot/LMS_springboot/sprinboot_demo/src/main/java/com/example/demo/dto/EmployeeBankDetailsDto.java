package com.example.demo.dto;

import com.example.demo.enums.AccountType;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeBankDetailsDto {

	private String id;
	private String accountNumber;
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
}
