package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empname;
	private String empaddress;
	private String skills;
	private int Experienceyrs;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getExperienceyrs() {
		return Experienceyrs;
	}

	public void setExperienceyrs(int experienceyrs) {
		Experienceyrs = experienceyrs;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empaddress=" + empaddress + ", skills=" + skills
				+ ", Experienceyrs=" + Experienceyrs + "]";
	}

}
