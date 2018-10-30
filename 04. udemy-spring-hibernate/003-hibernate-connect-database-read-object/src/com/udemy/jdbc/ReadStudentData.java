package com.udemy.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Student;

public class ReadStudentData {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
					
			System.out.println("read single student object");
			Student stdData = session.get(Student.class, 3);
			System.out.println(stdData);
			
			System.out.println("read all student object");
			@SuppressWarnings("unchecked")
			List<Student> allStudents = session
										.createQuery("from Student")
										.getResultList();
			System.out.println(allStudents);
			
			System.out.println("read all student object based on a field");
			@SuppressWarnings("unchecked")
			List<Student> allStudentsLastName = session
										.createQuery("from Student s where s.lastName='samal'")
										.getResultList();
			System.out.println(allStudentsLastName);
			
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
