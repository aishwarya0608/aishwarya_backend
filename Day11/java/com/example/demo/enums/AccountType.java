package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AccountType {

	SAVINGS("SAVINGS ACCOUNT"),
    CURRENT("CURRENT ACCOUNT"),
    FIXED("FIXED DEPOSIT ACCOUNT"),
    DEMAT("DEMAT ACCOUNT");
    
    private final String accountType;
	
}
