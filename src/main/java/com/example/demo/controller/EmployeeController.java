package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employee;
import com.example.demo.service.serviceinterface;

@RestController
public class EmployeeController {
	@Autowired
	serviceinterface sf;
	@PostMapping("/addemployee")
    public String addemployee(@RequestBody employee emp) {
		 String str=null;
	        boolean b=sf.addEmployee(emp);
	        if(b) {
	            str="employee record added successfully";
	        }
	        else {
	            str="failed";
	        }
			return str;
	}
	@PutMapping("/updateemployee")
    public employee updateEmployee(@RequestBody employee emp) {
        employee emp1=sf.updateEmployee(emp);
        return emp1;
    }
	@GetMapping("/getEmployeeById")
    public employee getEmployeeById(@RequestBody employee std) {
        return sf.getEmployeeById(std.getEid());
    }
	@GetMapping("/viewAllEmployees")
	    public List<employee> viewAllEmployees(){
	        return sf.viewAllEmployees();
	    }
	@DeleteMapping("/deleteByEmpId")
	    public String deleteByEmpId(@RequestBody  employee emp) {
	        String str=null;
	        boolean b=sf.deleteByEmpId(emp.getEid());
	        if(b) {
	            str="empoyee record deleted successfully";
	        }
	        return str;
	    }
}
