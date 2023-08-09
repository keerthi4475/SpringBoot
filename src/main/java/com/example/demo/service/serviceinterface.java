package com.example.demo.service;

import com.example.demo.entity.employee;

import java.util.List;

public interface serviceinterface {

	boolean addEmployee(employee emp);

	employee updateEmployee(employee emp);

	employee getEmployeeById(int eid);

	List<employee> viewAllEmployees();


	boolean deleteByEmpId(int eid);
	



}
