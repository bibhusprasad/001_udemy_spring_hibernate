package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Course;
import com.udemy.jdbc.entity.Instructor;
import com.udemy.jdbc.entity.InstructorDetail;

public class EagerVsLazyTest {

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
			
			Instructor instructor = session.get(Instructor.class, 2);
			System.out.println("Instructor : "+instructor);
			System.out.println("Course : "+instructor.getCourses());
			
			
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
