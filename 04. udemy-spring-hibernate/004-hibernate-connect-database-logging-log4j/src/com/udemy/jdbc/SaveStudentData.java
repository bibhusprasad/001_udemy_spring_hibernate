package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Student;

public class SaveStudentData {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			//create student object
			Student std1 = new Student("tapas", "panda", "tapaswipanda@gmail.com");
			
			//begin transaction
			session.beginTransaction();
					
			//save the student
			System.out.println("saving student object");
			session.save(std1);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("done !!!");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
