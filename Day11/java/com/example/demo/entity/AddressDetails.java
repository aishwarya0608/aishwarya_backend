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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_address_info")
@Builder
public class AddressDetails {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String address_type;
	private String door_number;
	private String street;
	private String locality;
	private String city;
	private String state;
	private Integer pincode;
	private String landmark;
	
	@JoinColumn(name="employee_id")
	@ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employeePrimaryInfo;
}
	

