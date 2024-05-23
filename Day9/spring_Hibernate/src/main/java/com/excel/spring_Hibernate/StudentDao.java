package com.excel.spring_Hibernate;

import java.util.List;

public interface StudentDao {
		
		public Integer insert(Student_1 s);
		public void delete(int id);
		public void delete(Student_1 s);
		public void update(Student_1 s);
		public Student_1 getStudent(int id);
		
		public List<Student_1> getAllStudents();
		

		
}





