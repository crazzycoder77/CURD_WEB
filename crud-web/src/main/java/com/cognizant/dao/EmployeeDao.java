package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeDao {

	public String create(Employee e);

	public String update(Employee e);

	public String delete(Employee e);

	public List<Employee> getAll();

	public Employee getById(int id);

}
