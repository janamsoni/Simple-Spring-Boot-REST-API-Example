package com.croods.springbootrestapiexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.croods.springbootrestapiexample.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> 
{
	

}
