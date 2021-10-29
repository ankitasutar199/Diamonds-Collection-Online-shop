package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.OnlineShopping.Entities.Employee; 
import com.OnlineShopping.Repository.EmployeeRepository; 

public class EmployeeService {
	
	   @Autowired
	    private EmployeeRepository repo;
	     
	    public List<Employee> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Employee employee) {
	        repo.save(employee);
	    }
	     
	    public Employee get(long empid) {
	        return repo.findById(empid).get();
	    }
	     
	    public void delete(long empid) {
	        repo.deleteById(empid);
	    }

}
