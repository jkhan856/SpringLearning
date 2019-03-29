package com.customer.testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDB
 */
@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setup connection variables
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=IST";
		String user ="hbstudent";
		String password = "hbstudent";
		String driver= "com.mysql.jdbc.Driver";
		
		//get Connection to database
		try {
			System.out.println("Connecting to JDBC: "+jdbcUrl);
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connection is successful!");
			
			PrintWriter out = response.getWriter();
			out.println("SUCCESS!");
			
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
