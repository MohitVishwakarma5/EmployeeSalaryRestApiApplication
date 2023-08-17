package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeSalary")
public class EmployeeModel {

	@Id
	private int eid;
	private String ename;
	private double salary;
	private double da;
	private double ta;
	private double hra;
	private double pf;
	private double grass_salary;
	private double net_salary;
	public EmployeeModel() {
		super();
	}
	public EmployeeModel(int eid, String ename, double salary, double da, double ta, double hra, double pf,
			double grass_salary, double net_salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.da = da;
		this.ta = ta;
		this.hra = hra;
		this.pf = pf;
		this.grass_salary = grass_salary;
		this.net_salary = net_salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrass_salary() {
		return grass_salary;
	}
	public void setGrass_salary(double grass_salary) {
		this.grass_salary = grass_salary;
	}
	public double getNet_salary() {
		return net_salary;
	}
	public void setNet_salary(double net_salary) {
		this.net_salary = net_salary;
	}
	@Override
	public String toString() {
		return "EmployeeModel [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", da=" + da + ", ta=" + ta
				+ ", hra=" + hra + ", pf=" + pf + ", grass_salary=" + grass_salary + ", net_salary=" + net_salary + "]";
	}
	
	
	
}
