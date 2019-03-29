package com.learning.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernatedemo.entity.Course;
import com.learning.hibernatedemo.entity.Instructor;
import com.learning.hibernatedemo.entity.InstructorDetails;


public class CreateInstructorCourses {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetails.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int theId = 1;
			//Use the session object to do DB operations		
			
			session.beginTransaction();
			Instructor tempInstructor = session.get(Instructor.class , theId);
			Course tempCourse1 = new Course("Spring MVC for Beginners");
			Course tempCourse2 = new Course("Python and Django Bootcamp");
			tempInstructor.addCourse(tempCourse1);
			tempInstructor.addCourse(tempCourse2);
			
			//Save to DB
			
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			//After any DB query
			session.getTransaction().commit();
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
