package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> employees = new ArrayList<Employee>();

	public EmployeeDaoImpl() {
		employees.add(new Employee(1, "A", 1.0));
		employees.add(new Employee(2, "B", 2.0));
		employees.add(new Employee(3, "C", 3.0));
		employees.add(new Employee(4, "D", 4.0));
		employees.add(new Employee(5, "E", 5.0));
	}

	public String create(Employee e) {
		try {
			employees.add(e);
			return "Success";
		} catch (Exception exception) {
			return "Failure";
		}

	}

	public String update(Employee e) {
		try {
			int i = employees.indexOf(e);
			employees.remove(i);
			employees.add(e);
			return "Success";
		} catch (Exception exception) {
			return "Failure";
		}

	}

	public String delete(Employee e) {
		try {
			int i = employees.indexOf(e);
			employees.remove(i);
			employees.add(e);
			return "Success";
		} catch (Exception exception) {
			return "Failure";
		}
	}

	public List<Employee> getAll() {

		return employees;
	}

	public Employee getById(int id) {
		return null;
	}

}
