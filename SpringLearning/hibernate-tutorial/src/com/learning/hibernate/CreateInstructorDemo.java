package com.learning.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernatedemo.entity.Course;
import com.learning.hibernatedemo.entity.Instructor;
import com.learning.hibernatedemo.entity.InstructorDetails;


public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetails.class)
									.addAnnotatedClass(Course.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Instructor tempInstructor = new Instructor("Mrinalini", "Boora", "mrinalini@queen.com");
			InstructorDetails tempInstructorDetails = new InstructorDetails("youtube/beautyQueen.com", "Singing");
			
			tempInstructor.setInstructorDetails(tempInstructorDetails);
			//Use the session object to do DB operations
			
			session.beginTransaction();
			//Save to DB
			session.save(tempInstructor);
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
