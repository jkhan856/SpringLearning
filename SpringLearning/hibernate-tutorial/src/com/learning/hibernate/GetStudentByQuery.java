package com.learning.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.hibernatedemo.entity.Student;

public class GetStudentByQuery {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student s where s.email like '%gmail.com'").getResultList();
			
			
			for(Student student : theStudents)
				System.out.println(student);
			session.getTransaction().commit();
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
