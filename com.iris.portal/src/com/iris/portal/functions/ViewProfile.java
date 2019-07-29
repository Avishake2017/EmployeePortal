package com.iris.portal.functions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.portalLogin.ConnectionProvider;
import com.iris.portalLogin.Daos;
import com.iris.portalLogin.DaosImpl;
import com.iris.portalLogin.Employee;


@WebServlet("/ViewProfile")
public class ViewProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out =response.getWriter();
				
				Daos daoObj=new DaosImpl();
				Employee emp = new Employee();
				Employee r=daoObj.getEmployeeDeatils(emp.getEmployeeId());
				
				try(Connection conn = ConnectionProvider.getDBConnection();){
				
					out.println("<h1>Your Details are</h1");
					
				out.println(r.getEmployeeName());
				out.println(r.getGender());
				out.println(r.getQualification());
				out.println(r.getEmailAddress());
				out.println(r.getRole());
				}catch(Exception e) {
					e.printStackTrace();
				}
				
	}

}
