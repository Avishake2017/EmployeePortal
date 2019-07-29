package com.iris.portalLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class DaosImpl  implements Daos{
	@Override
	public boolean Register(Employee emp) {
		
		try (Connection conn = ConnectionProvider.getDBConnection();)
		{
			System.out.println("Entering Implementation method");
			PreparedStatement ps = conn.prepareStatement("insert into Employee values(EmpSeq1.nextVal,?,?,?,?,?)");
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getGender());
			ps.setString(3, emp.getQualification());
			ps.setString(4, emp.getContactNo());
			ps.setString(5, emp.getEmailAddress());
			
			int i = ps.executeUpdate();
			if(i!=0) {
				
				ps=conn.prepareStatement("insert into EmployeeTable values(EmpSeq1.currval,?,'Employee')");
				ps.setString(1,emp.getPassword());
				System.out.println(emp.getPassword());
				ps.executeUpdate();
				return true;	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	@Override
	public Employee validate(int empid,String password){
		
				try(Connection conn= ConnectionProvider.getDBConnection();){
					
					PreparedStatement ps = conn.prepareStatement("Select empid,empname,gender,qualification,contactno,email,role from Employee join EmployeeTable using (empid) where empid = ? and password = ?");
					
					ps.setInt(1, empid);
					ps.setString(2, password);
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						String name = rs.getString(2);
						String gen = rs.getString(3);
						String qual = rs.getString(4);
						String contactno = rs.getString(5);
						String email = rs.getString(6);
						String role = rs.getString(7);
						
						Employee emp = new Employee();
						emp.setEmployeeId(empid);
						emp.setEmployeeName(name);
						emp.setGender(gen);
						emp.setEmailAddress(email);
						emp.setQualification(qual);
						emp.setContactNo(contactno);	
						emp.setRole(role);
					
						return emp;
						
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				return null;
	
	}
	@Override
	public Employee getEmployeeDeatils(int empid) {
		return null;
	}
	@Override
	public boolean updateDetails(Employee emp) {
		
		return false;
	}
	@Override
	public boolean deleteEmployee(int empid) {
		int id = empid;
		
		try(Connection conn = ConnectionProvider.getDBConnection();){
			
			
		
			PreparedStatement ps=conn.prepareStatement("delete from EmployeeTable where empid = ?");
			ps.setInt(1,id);
				
				ps.executeUpdate();
				
				 ps = conn.prepareStatement("delete from Employee where empid = ?");
				
				ps.setInt(1,id);
				ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public List<Employee> getAllEmployee() {
					
		return null;
	}
	
	
}
