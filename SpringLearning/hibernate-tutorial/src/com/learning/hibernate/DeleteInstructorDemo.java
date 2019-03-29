package com.learning.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernatedemo.entity.Instructor;
import com.learning.hibernatedemo.entity.InstructorDetails;


public class DeleteInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetails.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
					
			//Use the session object to do DB operations
			
			session.beginTransaction();
			
			int theId=3;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			//Save to DB

			session.delete(tempInstructor);
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
