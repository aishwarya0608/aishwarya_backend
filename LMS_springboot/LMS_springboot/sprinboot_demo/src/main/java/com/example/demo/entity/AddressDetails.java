package com.example.demo.entity;

import java.time.LocalDate;
import lombok.Builder;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "address_details")
public class AddressDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
    private String addressType;
    private String doorNumber;
    private String locality;
    private String street;
    private String city;
    private String pincode;
    private String state;
    private String landmark;


	
	@JoinColumn(name="employee_id")
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
	

