package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Entities.OrderDetails;
import com.OnlineShopping.Repository.OrderDetailsRepository;


@Service
@Transactional
public class OrderDetailsService {

	
	   @Autowired
	    private OrderDetailsRepository repo;
	     
	    public List<OrderDetails> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(OrderDetails orderdetails) {
	        repo.save(orderdetails);
	    }
	     
	    public OrderDetails get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
}
