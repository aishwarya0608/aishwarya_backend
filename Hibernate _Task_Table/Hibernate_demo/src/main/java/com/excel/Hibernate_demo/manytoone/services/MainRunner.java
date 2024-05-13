package com.excel.Hibernate_demo.manytoone.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.excel.Hibernate_demo.manytomany.entity.Admin;
import com.excel.Hibernate_demo.manytomany.entity.Users;

public class MainRunner {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("onlinemeeting");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		
       transaction.begin();
       transaction.commit();	  
       manager.close();
		
		
	}

}
