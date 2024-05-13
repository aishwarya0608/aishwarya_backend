package com.excel.Hibernate_demo.manytoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.excel.Hibernate_demo.manytomany.entity.Users;
import com.excel.Hibernate_demo.onetomany.entity.Meetings;
import com.excel.Hibernate_demo.onetomany.entity.ParticipantAvailaibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MeetingParticipants {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int participant_id;
	
	private String response_status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Users user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Meetings meeting;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ParticipantAvailaibility participantavailaibility;
	

}

