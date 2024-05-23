package com.example.demo.enums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmployeeStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ON_LEAVE("On Leave"),
    TERMINATED("Terminated"),
    RETIRED("Retired");
    
    private final String description;
}