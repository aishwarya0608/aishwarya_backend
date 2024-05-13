package com.excel.Hibernate_demo.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.excel.Hibernate_demo.manytomany.entity.Users;
import com.excel.Hibernate_demo.manytoone.entity.ChatMessages;
import com.excel.Hibernate_demo.manytoone.entity.MeetingInvitations;
import com.excel.Hibernate_demo.manytoone.entity.MeetingParticipants;
import com.excel.Hibernate_demo.manytoone.entity.MeetingUpdates;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Meetings {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int meeting_id;
	private String title;
	private String agenda;
	private String start_datetime;
	private String end_datetime;
	private String location;
	 
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    private Users user;
	 
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 private List <MeetingParticipants> meetingparticipants;
	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "meetings")
	 private List<MeetingInvitations> meetinginvitations;
	 
	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "meetings")
	 private List<MeetingUpdates> meetingupdates;
	 
	 @OneToMany(cascade = CascadeType.ALL, mappedBy = "meetings")
	 private List<ChatMessages> chatmessages;
	 
}
