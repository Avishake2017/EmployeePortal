package com.iris.portal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.portalLogin.Daos;
import com.iris.portalLogin.DaosImpl;
import com.iris.portalLogin.Employee;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						response.setContentType("text/html");
						PrintWriter out = response.getWriter();
						
						String name = request.getParameter("empname");
						String gen = request.getParameter("gen");
						String qual = request.getParameter("qual");
						String contactno = request.getParameter("contactno");
						String mail = request.getParameter("mail");
						String pass= request.getParameter("pass");
						
						
						Employee emp = new Employee();
						emp.setEmployeeName(name);
						emp.setGender(gen);
						emp.setQualification(qual);
						emp.setContactNo(contactno);
						emp.setEmailAddress(mail);
						emp.setPassword(pass);
						
						Daos daoObj=new DaosImpl();
						boolean  r=daoObj.Register(emp);
						
						if(r==true) {
							RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
							out.println("<h1>You have been registered</h1>");
							rd.forward(request, response);
						}
						else {
							out.println("Something Went Wrong");
							RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
							rd.include(request, response);
						}				
	}

}
