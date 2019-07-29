package com.iris.portal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.portalLogin.DaosImpl;
import com.iris.portalLogin.Employee;


@WebServlet("/UpdateUserInfo")
public class UpdateUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				String req = request.getParameter("param");
				
				HttpSession session = request.getSession();
				Employee emp3 = (Employee)session.getAttribute("UserObject");
				DaosImpl DaosObj = new DaosImpl();
				String id = 
				emp3.set
				
				boolean result  = DaosObj.updateDetails(emp3);
				
				if(result) {
					
				}
				
				
	}

}
