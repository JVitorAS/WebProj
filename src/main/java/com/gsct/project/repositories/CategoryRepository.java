package com.gsct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsct.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
