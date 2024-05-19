package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeDesignation {

    MANAGER("MANAGER"),ENGINEER("ENGINEER"),  ANALYST("ANALYST"),DIRECTOR("DIRECTOR"),CONSULTANT("CONSULTANT"), ASSOCIATE("ASSOCIATE"); 
	
	private final String employeeDesignation;
}