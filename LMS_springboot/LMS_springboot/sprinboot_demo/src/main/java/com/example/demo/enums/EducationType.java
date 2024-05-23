package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

public enum EducationType {
    PRIMARY("Primary Education"),
    SECONDARY("Secondary Education"),
    HIGH_SCHOOL("High School"),
    UNDERGRADUATE("Undergraduate Education"),
    POSTGRADUATE("Postgraduate Education");
    
    private final String educationType;
}