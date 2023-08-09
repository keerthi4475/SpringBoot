package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.repo.myrepo;

@Service
public class serviceimpl implements serviceinterface{
	@Autowired
	myrepo repo;

	@Override
	public boolean addEmployee(employee emp) {
		repo.save(emp);
		return true;
	}
	public employee updateEmployee(employee emp) {
		 employee emp1=repo.getById(emp.getEid());
	        emp1.setCity(emp.getCity());
	        emp1.setEmail(emp.getEmail());
	        emp1.setEname(emp.getEname());
	        employee e=repo.save(emp1);
	        return e;
	}
	@Override
	public employee getEmployeeById(int eid) {
		
        return repo.findById(eid).get();
	}
	@Override
	public List<employee> viewAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public boolean deleteByEmpId(int eid) {
		// TODO Auto-generated method stub
		repo.deleteById(eid);
		return true;
	}
	
}
