package com.issproject.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("confirm-password");
		out.print(name);
		out.print(email);
		out.print(password);
		
		RequestDispatcher dispatcher = null;
		Connection connect = null;
		if(name == null || name.equals("")) {
			request.setAttribute("status","invalidName");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(email == null || email.equals("")) {
			request.setAttribute("status","invalidEmail");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(password == null || password.equals("")) {
			request.setAttribute("status","invalidPassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(cpassword == null || cpassword.equals("")) {
			request.setAttribute("status","invalidCPassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);
		}
		if(password.length() < 8) {
			request.setAttribute("status","invalidSizePassword");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);			
		}
		if(!cpassword.equals((password))) {
			request.setAttribute("status","passwordMismatch");
			dispatcher = request.getRequestDispatcher("registration.jsp");
			dispatcher.forward(request, response);	
		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/iss", "root","Akashrsy@1");
			PreparedStatement sql_statement = connect.prepareStatement("insert into users(name,password,email) values(?,?,?) ");
			sql_statement.setString(1,name);
			sql_statement.setString(2,password);
			sql_statement.setString(3,email);
			
			int row = sql_statement.executeUpdate();
			dispatcher = request.getRequestDispatcher("registration.jsp");
			if(row > 0) {
				request.setAttribute("status", "success");
			}
			else {
				request.setAttribute("status","failed");
			}
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
