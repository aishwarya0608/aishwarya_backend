package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {

	HOME("Home Address"),
    WORK("Work Address"),
    OTHER("Other Address");
    
    private final String addressType;
	
}
