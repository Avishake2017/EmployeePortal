package com.iris.portalLogin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/validateLogin")
public class validateLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
				
				response.setContentType("text/html");
				int employeeid  = Integer.parseInt(request.getParameter("empid"));
				String pass = request.getParameter("pass");
				
				Daos daoObj=new DaosImpl();
				Employee r=daoObj.validate(employeeid, pass);
				
				if(r !=null) {
					
					HttpSession session = request.getSession();
					session.setAttribute("UserId", r.getEmployeeId());
					session.setAttribute("UserObject",r);
					session.setAttribute("userObj", r.getEmployeeName());
					session.setAttribute("userName",r.getEmployeeName() );
					session.setAttribute("userGender",r.getGender());
					session.setAttribute("userQualification",r.getQualification() );
					session.setAttribute("userContact",r.getContactNo());
					session.setAttribute("userMail",r.getEmailAddress() );
					session.setAttribute("userRole",r.getRole() );
					
					if(r.getRole().equals("admin")) {
						RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
						rd.forward(request, response);
					}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("WelcomePageEmployees.jsp");
						rd.forward(request, response);
					}
				}
					else {
						RequestDispatcher rd = request.getRequestDispatcher("LoginPage.jsp");
						
						rd.forward(request, response);
					}
				}	
				
	}