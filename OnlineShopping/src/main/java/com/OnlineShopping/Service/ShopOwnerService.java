package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Entities.ShopOwner;
import com.OnlineShopping.Repository.ShopOwnerRepository;


@Service
@Transactional
public class ShopOwnerService {
	
	 @Autowired
	    private ShopOwnerRepository repo;
	     
	    public List<ShopOwner> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(ShopOwner shopowner) {
	        repo.save(shopowner);
	    }
	     
	    public ShopOwner get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
