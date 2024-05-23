package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ContactType {
    EMAIL("Email"),
    PHONE("Phone"),
    MOBILE("Mobile"),
    FAX("Fax"),
    SOCIAL_MEDIA("Social Media");
    
    
    private final String contactType;
}
