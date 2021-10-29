package com.OnlineShopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineShopping.Entities.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {

}
