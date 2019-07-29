package com.iris.portal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.portalLogin.ConnectionProvider;
import com.iris.portalLogin.Daos;
import com.iris.portalLogin.DaosImpl;
import com.iris.portalLogin.Employee;


@WebServlet("/UpdateName")
public class UpdateName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
							response.setContentType("text/html");
							PrintWriter out = response.getWriter();
							String newname = request.getParameter("newName");
							int id =Integer.parseInt( request.getParameter("eid"));
							
							Employee emp = request.getAttribute(newname);
							Daos daoObj=new DaosImpl();
							boolean  r=daoObj.updateDetails(emp);
							try(Connection conn = ConnectionProvider.getDBConnection();){
									
								PreparedStatement ps = conn.prepareStatement("update Employee set empname = ? where empid = eid");
								ps.setString(1, newname);
								
								int rs = ps.executeUpdate();
								if(rs!=0) {
								RequestDispatcher rd= request.getRequestDispatcher("WelcomePageEmployees.jsp");
								out.println("Profile Updated");
								rd.include(request, response);
								}
								else
									out.println("Invalid Update");
							}catch(Exception e) {
								e.printStackTrace();
							}
	}

}
