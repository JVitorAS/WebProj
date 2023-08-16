package com.gsct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsct.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
