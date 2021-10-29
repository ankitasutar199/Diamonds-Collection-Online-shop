package com.OnlineShopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShopping.Entities.Shop;

public interface ShopRepository extends JpaRepository<Shop,Long> {

}
