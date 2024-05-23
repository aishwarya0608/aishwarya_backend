package com.excel.spring_Hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	
    	StudentDao studentdao = context.getBean("studentDao",StudentDao.class);
    	
    	
    	Student_1 stu = new Student_1(1,"jack");
    	Student_1 stu1 = new Student_1(2,"jack");
    	studentdao.insert(stu);
    	studentdao.insert(stu1);
    	studentdao.delete(7);
    	
    	
    	
    }
}
