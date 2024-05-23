package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeTechnicalSkills;

public interface TechnicalSkillsRepository extends JpaRepository<EmployeeTechnicalSkills, Integer> 
{ 
	
	Optional<EmployeeTechnicalSkills> findBySkillTypeAndSkillRatingAndYearOfExperience(String skillType, String skillRating, String yearOfExperience);
}

