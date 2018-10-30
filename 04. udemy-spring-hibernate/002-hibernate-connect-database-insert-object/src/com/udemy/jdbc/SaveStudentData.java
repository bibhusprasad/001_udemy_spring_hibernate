package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Student;

public class SaveStudentData {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			//create student object
			Student std1 = new Student("bibhu", "samal", "bibhusprasad@gmail.com");
			Student std2 = new Student("alok", "dash", "dash.alok01@gmail.com");
			Student std3 = new Student("asutosh", "panda", "asutosh.1989@gmail.com");
			Student std4 = new Student("samresh", "satpathy", "samresh.1990.ctc@gmail.com");
			
			//begin transaction
			session.beginTransaction();
					
			//save the student
			System.out.println("saving student object");
			session.save(std1);
			//session.save(std2);
			//session.save(std3);
			//session.save(std4);
			
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
