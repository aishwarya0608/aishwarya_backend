package com.example.demo.dto;

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

	private Integer id;
	private Integer accountNumber;
	private String bankName;
	private String accountTtype;
	private Integer ifscCode;
	private String branch;
	private String state;
}
