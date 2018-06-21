package com.croods.springbootrestapiexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croods.springbootrestapiexample.model.Employee;
import com.croods.springbootrestapiexample.repository.EmployeeRepository;


@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an employee*/
	
	public Employee save(Employee emp) 
	{
		return employeeRepository.save(emp);
	}
	
	
	/* search all employees*/
	
	public Iterable<Employee> findAll()
	{
		return employeeRepository.findAll();
		
	}
	
	
	/*get an employee by id*/
	public Employee findOne(Integer empid) 
	{
		return employeeRepository.findById(empid).orElse(new Employee());
	}
	
	
	/*delete an employee*/
	
	public void delete(Employee emp) 
	{
		employeeRepository.delete(emp);
	}
	

}
