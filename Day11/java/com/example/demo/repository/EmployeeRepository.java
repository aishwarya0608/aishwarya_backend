package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeePrimaryInfo;

public interface EmployeeRepository  extends JpaRepository<EmployeePrimaryInfo, Integer>

{
	Optional<EmployeePrimaryInfo> findByEmployeeId(String employeeId);
}
