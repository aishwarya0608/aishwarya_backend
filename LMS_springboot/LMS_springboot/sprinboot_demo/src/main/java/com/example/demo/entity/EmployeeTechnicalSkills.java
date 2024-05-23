package com.example.demo.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_technicalskills_info")
@Builder

public class EmployeeTechnicalSkills {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String skillType;
	private String  skillRating;
	private String yearOfExperience;
	private String maritalStatus;
	@JoinTable(name="map_skill_employee",joinColumns = @JoinColumn(name="skills_id"),inverseJoinColumns = @JoinColumn(name="employee_id"))

	@ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo>employeePrimaryInfo;

}
