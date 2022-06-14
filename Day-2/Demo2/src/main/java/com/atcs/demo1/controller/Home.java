package com.atcs.demo1.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atcs.demo1.model.Employee;


@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("Id");
		String name = request.getParameter("name");
		String Salary = request.getParameter("salary");
		
		Employee emp = new Employee();
		emp.setId(Integer.parseInt(id));
		emp.setName(name);
		emp.setSalary(Integer.parseInt(Salary));
		
		//used to navigate to view page
		
		RequestDispatcher rd = request.getRequestDispatcher("view/Home.jsp");
		request.setAttribute("employee", emp);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
