package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Entities.User;
import com.OnlineShopping.Repository.UserRepository;


@Service
@Transactional
public class UserService {
	
	 @Autowired
	    private UserRepository repo;
	     
	    public List<User> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(User user) {
	        repo.save(user);
	    }
	     
	    public User get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
	

}
