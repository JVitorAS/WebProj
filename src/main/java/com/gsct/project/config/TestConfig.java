package com.gsct.project.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gsct.project.entities.User;
import com.gsct.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Bener", "Maria@email.com", "981701212", "123456");
		User u2 = new User(null, "Alex Green", "Alex@email.com", "977772898", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
