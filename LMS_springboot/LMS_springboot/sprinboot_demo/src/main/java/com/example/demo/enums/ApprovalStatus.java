package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum ApprovalStatus {
	
    PENDING("Pending"),APPROVED("Approved"), REJECTED("Rejected"), WITHDRAWN("Withdrawn"), CANCELLED("Cancelled"),COMPLETED("Completed");
    
    private final String approvalStatus;
}