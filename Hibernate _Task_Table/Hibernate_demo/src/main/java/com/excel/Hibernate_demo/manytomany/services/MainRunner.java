package com.excel.Hibernate_demo.manytomany.services;

import java.util.ArrayList;
import java.util.List;

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
		
		
      Users users = new Users();
      Admin admin = new Admin();
      
      //List<Users> listofusers = new ArrayList();
     // List<Admin> listofadmin = new ArrayList();
      
      users.getAdmin();
      admin.getUsers();
      
      //listofusers.add(users);
      //listofadmin.add(admin);
      
      transaction.begin();
      transaction.commit();	  
      manager.close();

	}

}
