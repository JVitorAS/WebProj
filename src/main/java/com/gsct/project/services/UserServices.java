package com.gsct.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gsct.project.entities.User;
import com.gsct.project.repositories.UserRepository;

@Service
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null); 
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

	public void delete(Long id) {
		repository.deleteById(id);;
	}
}