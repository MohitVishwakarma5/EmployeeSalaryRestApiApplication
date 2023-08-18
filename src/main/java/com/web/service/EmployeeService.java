package com.web.service;

import java.util.List;

import com.web.model.EmployeeModel;

public interface EmployeeService {

	public EmployeeModel saveEmployee(EmployeeModel employee);
	public EmployeeModel getEmployee(Integer eid);
	public List<EmployeeModel> getAllemployee();
	public EmployeeModel deleteEmployee(Integer eid);
	public EmployeeModel updateEmployee(EmployeeModel employee,Integer eid);
	public List<EmployeeModel> getEmployeeSalary(double salary);
	
	
}
