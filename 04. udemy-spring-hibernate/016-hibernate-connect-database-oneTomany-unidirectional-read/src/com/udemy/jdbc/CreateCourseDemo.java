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
			
			Course course = session.get(Course.class, 12);
			
			System.out.println(course);
			
			System.out.println(course.getReviews());
			
			session.getTransaction().commit();
			
			System.out.println("Done !!");
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			sessionFactory.close();
		}

	}

}
