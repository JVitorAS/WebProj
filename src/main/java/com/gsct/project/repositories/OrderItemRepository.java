package com.gsct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsct.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
