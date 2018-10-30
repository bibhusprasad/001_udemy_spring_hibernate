package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Course;
import com.udemy.jdbc.entity.Instructor;
import com.udemy.jdbc.entity.InstructorDetail;

public class OneToManyBiDirectionalCretaeCouseTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			int id = 2;
			
			Instructor instructor = session.get(Instructor.class, id);
			
			Course course1 = session.get(Course.class, 12);
			Course course2 = session.get(Course.class, 11);
			
			
			instructor.add(course1);
			instructor.add(course2);
			
			session.save(course1);
			session.save(course2);
			
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
