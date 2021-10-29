package com.OnlineShopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OnlineShopping.Entities.Shop;
import com.OnlineShopping.Repository.ShopRepository;


@Service
@Transactional
public class ShopService {
	  @Autowired
	    private ShopRepository repo;
	     
	    public List<Shop> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Shop shop) {
	        repo.save(shop);
	    }
	     
	    public Shop get(long id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }

}
