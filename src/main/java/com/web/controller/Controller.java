package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.EmployeeModel;
import com.web.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	public EmployeeService service;
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeModel employee)
	{
		EmployeeModel e = service.saveEmployee(employee);
		String msg = null;
		if(e!=null) {
			msg="Data Successfully Inserted";
		}else {
			msg="Data Not a Inserted";
		}
		return msg;
	}
	@GetMapping("/get/{eid}")
	public EmployeeModel getEmployee(@PathVariable Integer eid) {
		return service.getEmployee(eid);
	}
	@GetMapping("/get")
	public List<EmployeeModel> getAllEmployee(){
		return service.getAllemployee();
	}
	@DeleteMapping("delete/{eid}")
	public String deleteEmployee(@PathVariable Integer eid)
	{
	  EmployeeModel e2 = service.deleteEmployee(eid);
	  String text=null;
	  if(e2==null) {
		  text="Data Successfully Deleted";
	  }
	  return text;
	}
	@PutMapping("update/{eid}")
	public EmployeeModel updateEmployee(@RequestBody EmployeeModel employee,@PathVariable Integer eid)
	{
		return service.updateEmployee(employee, eid);
	}
}
