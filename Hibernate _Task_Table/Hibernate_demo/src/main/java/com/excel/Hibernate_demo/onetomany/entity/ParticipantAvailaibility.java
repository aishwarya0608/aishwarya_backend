package com.excel.Hibernate_demo.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.excel.Hibernate_demo.manytoone.entity.MeetingParticipants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class ParticipantAvailaibility {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int availability_id;
	private String start_datetime;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "participantavailaibility")
	private List<MeetingParticipants> meetingparticipants;
	
	
}
