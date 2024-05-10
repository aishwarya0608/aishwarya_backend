package com.excel.hibernet_demo.onetoone.services;
/*
import com.excel.hibernet_demo.onetoone.entity.MarksCard;
import com.excel.hibernet_demo.onetoone.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {
	
	private static EntityManagerFactory factory;
	private static EntityManager  manager;
	private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		
		Student st = new Student();
		st.setName("john");
		st.setAge(23);
		
		MarksCard card = new MarksCard();
		card.setGrade("A");
		card.setMarks(90);
		card.setStudent(st);
		
		transaction.begin();
		manager.persist(card);
		transaction.commit();
		
		manager.close();
	}

}
*/