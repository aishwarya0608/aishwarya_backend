package com.excel.Hibernate_demo.manytoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.excel.Hibernate_demo.onetomany.entity.Meetings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class MeetingUpdates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int update_id;
	private String update_message;
	private String update_datetime;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	 private Meetings meetings;
	
	
}
