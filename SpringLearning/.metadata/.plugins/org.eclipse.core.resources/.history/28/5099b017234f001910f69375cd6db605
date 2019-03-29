package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=IST";
		String user ="hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connecting to JDBC: "+jdbcUrl);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connection is successful!");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
