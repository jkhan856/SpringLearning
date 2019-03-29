package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	public List<Customer> getCustomers() {
		
		Session session;

		try {
		    session = sessionFactory.getCurrentSession();
		    System.out.println("TryBlock");
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		    System.out.println("CatchBlock");
		}
		
		System.out.println("Creating Query");
		Query<Customer> query = session.createQuery("from Customer",Customer.class);
		System.out.println("Query Created");
		List<Customer> customers = query.getResultList();
		System.out.println("Got list");
		return customers;
	}

}
