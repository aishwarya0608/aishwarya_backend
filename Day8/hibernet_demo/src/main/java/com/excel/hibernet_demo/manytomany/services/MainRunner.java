package com.excel.hibernet_demo.manytomany.services;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernet_demo.manytomany.entity.Book;
import com.excel.hibernet_demo.manytomany.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		List<Book> books = new ArrayList<>();
		List<Student> s = new ArrayList<>();
		
		

		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		b1.setTitle("war and peace");
		b1.setStudents(s);
		
		b2.setTitle("The Tempest");
		b2.setStudents(s);
		
		b3.setTitle("cosmos");
		b3.setStudents(s);
		
		st1.setName("John");
		st1.setBooks(books);

		
		st2.setName("Oliver");
		
		st2.setBooks(books);

		
		st3.setName("Rohan");
		
		st3.setBooks(books);
		
		transaction.begin();
		manager.persist(st1);
		
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		
		transaction.commit();
		
		manager.close();
		
	}

}
