package com.web.service;

import java.util.List;
import java.util.Optional;

import com.web.model.EmployeeModel;

public interface EmployeeService {

	public EmployeeModel saveEmployee(EmployeeModel employee);
	public EmployeeModel getEmployee(Integer eid);
	public List<EmployeeModel> getAllemployee();
	public EmployeeModel deleteEmployee(Integer eid);
	public EmployeeModel updateEmployee(EmployeeModel employee,Integer eid);
}
