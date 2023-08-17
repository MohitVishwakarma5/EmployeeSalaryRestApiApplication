package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.EmployeeModel;
import com.web.repo.EmployeeRepo;

@Service
public class EmployeeServiceImp implements EmployeeService {

	 static double ta;
	 static double da;
	 static double hra;
	 static double pf;
	 static double g_salary;
	 static double n_salary;
	
	@Autowired
	public EmployeeRepo repo;
	
	@Override
	public EmployeeModel saveEmployee(EmployeeModel employee) {
		ta = employee.getTa();
		da = employee.getDa();
		hra = employee.getHra();
		pf = employee.getPf();
		g_salary = employee.getGrass_salary();
		n_salary = employee.getNet_salary();
		
		if(employee.getSalary()<30000) {
		ta = (employee.getSalary()*7)/100;
		da = (employee.getSalary()*9)/100;
		hra = (employee.getSalary()*11)/100;
		pf = (employee.getSalary()*15)/100;
		g_salary = employee.getSalary()+ta+da+hra;
		n_salary = g_salary-pf;
		
		}else if(employee.getSalary()>=30000 && employee.getSalary()<50000) {
			ta = (employee.getSalary()*12)/100;
			da = (employee.getSalary()*13)/100;
			hra = (employee.getSalary()*17)/100;
			pf = (employee.getSalary()*23)/100;
			g_salary = employee.getSalary()+ta+da+hra;
			n_salary = g_salary-pf;
			
		}else if(employee.getSalary()>=50000) {
		ta = (employee.getSalary()*17)/100;
		da = (employee.getSalary()*19)/100;
		hra = (employee.getSalary()*21)/100;
		pf = (employee.getSalary()*25)/100;
		g_salary = employee.getSalary()+ta+da+hra;
		n_salary = g_salary-pf;
		}
		
		employee.setSalary(employee.getSalary());
		employee.setTa(ta);
		employee.setDa(da);
		employee.setHra(hra);
		employee.setPf(pf);
		employee.setGrass_salary(g_salary);
		employee.setNet_salary(n_salary);
		EmployeeModel e = repo.save(employee);
		
		return e;
	}

	@Override
	public EmployeeModel getEmployee(Integer eid) {
		EmployeeModel e1 = repo.findById(eid).get();
		return e1;
	}

	@Override
	public List<EmployeeModel> getAllemployee() {
		List<EmployeeModel> e2 = repo.findAll();
		return e2;
	}

	@Override
	public EmployeeModel deleteEmployee(Integer eid) {
		repo.deleteById(eid);
		return null;
	}

	@Override
	public EmployeeModel updateEmployee(EmployeeModel employee, Integer eid) {
		Optional<EmployeeModel> optional = repo.findById(eid);
		if(employee.getSalary()<30000) {
			ta = (employee.getSalary()*7)/100;
			da = (employee.getSalary()*9)/100;
			hra = (employee.getSalary()*11)/100;
			pf = (employee.getSalary()*15)/100;
			g_salary = employee.getSalary()+ta+da+hra;
			n_salary = g_salary-pf;
			
			}else if(employee.getSalary()>=30000 && employee.getSalary()<50000) {
				ta = (employee.getSalary()*12)/100;
				da = (employee.getSalary()*13)/100;
				hra = (employee.getSalary()*17)/100;
				pf = (employee.getSalary()*23)/100;
				g_salary = employee.getSalary()+ta+da+hra;
				n_salary = g_salary-pf;
				
			}else if(employee.getSalary()>=50000) {
			ta = (employee.getSalary()*17)/100;
			da = (employee.getSalary()*19)/100;
			hra = (employee.getSalary()*21)/100;
			pf = (employee.getSalary()*25)/100;
			g_salary = employee.getSalary()+ta+da+hra;
			n_salary = g_salary-pf;
			}
		
		EmployeeModel e = optional.get();
		e.setEid(eid);
		e.setEname(employee.getEname());
		e.setSalary(employee.getSalary());
		e.setTa(ta);
		e.setDa(da);
		e.setHra(hra);
		e.setPf(pf);
		e.setGrass_salary(g_salary);
		e.setNet_salary(n_salary);
		return repo.save(e);
	}

	
}
