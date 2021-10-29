package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Entities.MallAdmin;
import com.OnlineShopping.Repository.MallAdminRepository;

@Service
@Transactional
public class MallAdminService {
	
	   @Autowired
	    private MallAdminRepository repo;
	     
	    public List<MallAdmin> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(MallAdmin malladmin) {
	        repo.save(malladmin);
	    }
	     
	    public MallAdmin get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
