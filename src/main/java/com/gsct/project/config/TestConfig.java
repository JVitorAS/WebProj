package com.gsct.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gsct.project.entities.Order;
import com.gsct.project.entities.User;
import com.gsct.project.repositories.OrderRepository;
import com.gsct.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Maria Bener", "Maria@email.com", "981701212", "123456");
		User u2 = new User(null, "Alex Green", "Alex@email.com", "977772898", "654321");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-06-20T19:53:07z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-06-20T19:21:07Z"), u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

	
	
	
	
}
