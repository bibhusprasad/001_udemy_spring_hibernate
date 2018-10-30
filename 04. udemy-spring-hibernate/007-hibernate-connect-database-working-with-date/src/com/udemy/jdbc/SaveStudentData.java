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
			
			/*
			 
			String dateStr = "1990/09/21";
			Date date = DateUtil.parseDate(dateStr);
			Student std1 = new Student("ankita", "sahu", "sahu.ankita@gmail.com", date);
			
			session.beginTransaction();
					
			System.out.println("saving student object");
			session.save(std1);
			
			session.getTransaction().commit();
			
			
			*/
			
			
			System.out.println("read date object");
			session.beginTransaction();
			
			Student s = session.get(Student.class, 9);
			
			System.out.println(s);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

}
