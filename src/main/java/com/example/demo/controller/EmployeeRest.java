package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeRest {
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping(value="/EmployeeDetails")
	public List<Employee> EmployeeDet(Employee employee) {
		
		return repo.findAll();
	}
	
	@GetMapping(value="/EmployeeDetails/{empId}")
	public Optional<Employee> EmployeeDet(@PathVariable("empId") int id) {
		
		return repo.findById(id);
	}
	
	@PostMapping(value="/EmployeeDetails")
	public String Add(@RequestBody Employee employee) {
		
		repo.save(employee);
		return "saved";
		
	}
	@PutMapping(value="/EmployeeDetails")
	public String put(@RequestBody Employee employee) {
		
		repo.save(employee);
		return "saved";
		
	}
	
	@DeleteMapping(value="/EmployeeDetails/{empId}")
	public String delete(@PathVariable("empId") int id) {
		
		repo.deleteById(id);
		return "Deleted Successfully";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
