package com.croods.springbootrestapiexample.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croods.springbootrestapiexample.dao.EmployeeDAO;
import com.croods.springbootrestapiexample.model.Employee;

@RestController
@RequestMapping("/company")
public class EmployeeController 
{
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	/* to save an employee*/
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) 
 	{
		return employeeDAO.save(emp);
	}
	
	/*get all employees*/
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return (List<Employee>) employeeDAO.findAll();
	}
	
	/*get employee by empid*/
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(value="id") Integer empid)
	{
		
		Employee emp=employeeDAO.findOne(empid);
		return emp;
		
	}
	
	
	/*update an employee by empid*/
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(value="id") Integer empid,@RequestBody Employee empDetails){
		
		Employee emp=employeeDAO.findOne(empid);
	
		emp.setName(empDetails.getName());
		emp.setDesignation(empDetails.getDesignation());
		emp.setExpertise(empDetails.getExpertise());
		
		Employee updateEmployee=employeeDAO.save(emp);
		return updateEmployee;
		
		
		
	}
	
	/*Delete an employee*/
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable(value="id") Integer empid){
		
		Employee emp=employeeDAO.findOne(empid);
		if(emp==null) {
			return ResponseEntity.notFound().build();
		}
		employeeDAO.delete(emp);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	

}
