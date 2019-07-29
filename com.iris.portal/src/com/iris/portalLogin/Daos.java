package com.iris.portalLogin;

import java.util.List;

public interface Daos {
				public boolean Register(Employee emp);
				public Employee validate(int empid,String empname);
				public Employee getEmployeeDeatils(int empid);
				public boolean updateDetails(Employee emp);
				public boolean deleteEmployee(int empid);
				public List<Employee> getAllEmployee();
							
}
