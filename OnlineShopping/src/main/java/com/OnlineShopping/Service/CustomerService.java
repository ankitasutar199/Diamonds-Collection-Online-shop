package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Repository.CustomerRepository;
import com.OnlineShopping.Entities.Customer;
@Service
@Transactional
public class CustomerService {
	
	 @Autowired
	    private CustomerRepository repo;
	     
	    public List<Customer> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Customer customer) {
	        repo.save(customer);
	    }
	     
	    public Customer get(long custid) {
	        return repo.findById(custid).get();
	    }
	     
	    public void delete(long custid) {
	        repo.deleteById(custid);
	    }

}
