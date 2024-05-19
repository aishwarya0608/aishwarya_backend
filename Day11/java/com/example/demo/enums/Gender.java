package com.example.demo.enums;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");
    
    
    private final String gender;
}