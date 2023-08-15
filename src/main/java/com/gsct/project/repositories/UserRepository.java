package com.gsct.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsct.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
