package com.gsct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsct.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
