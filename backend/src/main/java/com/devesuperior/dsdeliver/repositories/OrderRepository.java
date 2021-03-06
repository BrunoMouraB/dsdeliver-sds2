package com.devesuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devesuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
	@Query("SELECT DISTINCT obj FROM Order obj  JOIN FETCH obj.products "
		     + " WHERE obj.status = 0 Order BY obj.moment ASC")
		    List<Order> findOrdersWithProduts();
    
  }
