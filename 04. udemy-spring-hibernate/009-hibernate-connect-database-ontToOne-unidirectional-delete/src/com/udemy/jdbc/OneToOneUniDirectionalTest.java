package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Instructor;
import com.udemy.jdbc.entity.InstructorDetail;

public class OneToOneUniDirectionalTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			int id = 3;
			
			Instructor instructor = session.get(Instructor.class, id);

			System.out.println(instructor);
			
			session.delete(instructor);
			
			session.getTransaction().commit();
			
			System.out.println("Done !!");
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

	}

}
