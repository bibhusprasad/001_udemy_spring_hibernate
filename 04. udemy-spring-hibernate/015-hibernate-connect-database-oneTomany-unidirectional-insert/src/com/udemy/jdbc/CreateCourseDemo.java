package com.udemy.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.udemy.jdbc.entity.Course;
import com.udemy.jdbc.entity.Instructor;
import com.udemy.jdbc.entity.InstructorDetail;
import com.udemy.jdbc.entity.Review;

public class CreateCourseDemo {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 1);
			
			Course course1 = new Course("c");
			Course course2 = new Course("php");
			
			course1.add(new Review("very good"));
			
			instructor.add(course1);
			instructor.add(course2);
			
			session.save(course1);
			session.save(course2);
			
			session.getTransaction().commit();
			
			System.out.println("Done !!");
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			sessionFactory.close();
		}

	}

}
