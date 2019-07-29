package com.iris.portal;

import com.iris.portalLogin.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.portalLogin.Employee;


@WebServlet("/DeleteProfile")
public class DeleteProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			HttpSession session = request.getSession();
			Employee emp2 = (Employee)session.getAttribute("UserObject");
			
			int eid = (int) session.getAttribute("UserId");
			DaosImpl DaosObj = new DaosImpl();
			
			boolean result =  DaosObj.deleteEmployee(eid);
			
			if(result) {
				RequestDispatcher rd  = request.getRequestDispatcher("LoginPage.jsp");
				rd.include(request, response);
				out.println("You have been successfully deleted");
			}
			else
			{
				out.println("Something Went Wrong");
				RequestDispatcher rd  = request.getRequestDispatcher("WelcomePageEmployees.jsp");
				rd.include(request, response);
			}
	}
}
