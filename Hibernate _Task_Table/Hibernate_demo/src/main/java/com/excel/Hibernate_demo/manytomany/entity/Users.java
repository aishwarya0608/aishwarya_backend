package com.excel.Hibernate_demo.manytomany.entity;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.excel.Hibernate_demo.manytoone.entity.ChatMessages;
import com.excel.Hibernate_demo.manytoone.entity.MeetingInvitations;
import com.excel.Hibernate_demo.manytoone.entity.MeetingParticipants;
import com.excel.Hibernate_demo.onetomany.entity.Meetings;
import com.excel.Hibernate_demo.onetomany.entity.Notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Admin> admin;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List <Notification> notification;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MeetingParticipants meetingparticipants;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<MeetingInvitations>  invitations ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<ChatMessages> chatmessages;
	
}
