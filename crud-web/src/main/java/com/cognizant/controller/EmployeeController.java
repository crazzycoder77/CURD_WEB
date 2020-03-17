package com.cognizant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.model.Employee;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve the Request parameter
		String action = request.getParameter("action");
		// System.out.println("Action = " + action);
		if (action.equals("insert")) {
			// Process The Request
			insert(request, response);
		} else if (action.equals("update")) {
			// Process The Request
			update(request, response);
		} else if (action.equals("delete")) {
			// Process The Request
			delete(request, response);
		} else if (action.equals("getAll")) {
			// Process The Request
			getAll(request, response);
		} else {

		}
	}

	private void getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Invoking Dao
		List<Employee> employees = employeeDao.getAll();
		// employees.add(new Employee());
		// System.out.println(employees);
		// Dispatch The Request to show.jsp
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		// Add The Data/Attribute to the request
		request.setAttribute("employees", employees);
		// Forward the request
		rd.forward(request, response);
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Employee employee = new Employee();
		employee.setId(id);
		String status = "Delete "+employeeDao.delete(employee);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("status", status);
		rd.forward(request, response);
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee employee = new Employee(id, name, salary);
		String status = "Update " + employeeDao.update(employee);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("status", status);
		rd.forward(request, response);
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		Employee employee = new Employee(id, name, salary);
		String status = "Insert " + employeeDao.create(employee);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		request.setAttribute("status", status);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
