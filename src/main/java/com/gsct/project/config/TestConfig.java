package com.gsct.project.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gsct.project.entities.Category;
import com.gsct.project.entities.Order;
import com.gsct.project.entities.Product;
import com.gsct.project.entities.User;
import com.gsct.project.entities.enums.OrderStatus;
import com.gsct.project.repositories.CategoryRepository;
import com.gsct.project.repositories.OrderRepository;
import com.gsct.project.repositories.ProductRepository;
import com.gsct.project.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
    	Category cat1 = new Category(null, "Electronics");
    	Category cat2 = new Category(null, "Books");
    	Category cat3 = new Category(null, "Computers");

    	
    	Product p1 = new Product(null, "Lord of the Ring", "Lorem ipsum dolor sit amet, consectetur", 90.5, "");
    	Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus, Maecenas ante", 2190.0, "");
    	Product p3 = new Product(null, "Macbook Pro", "Nam eleifed maximus tortor, at mollis", 1250.5, "");
    	Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
    	Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus", 100.99, "");
    	
    	categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    	productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    	
    	p1 .getCategories().add(cat2);
    	p2.getCategories().add(cat1);
    	p2.getCategories().add(cat3);
    	p3.getCategories().add(cat3);
    	p4.getCategories().add(cat3);
    	p5.getCategories().add(cat2);
    	
    	productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    	
        User u1 = new User(null, "Maria Bener", "maria@email.com", "981701212", "123456");
        User u2 = new User(null, "Alex Green", "alex@email.com", "977772898", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED, u2);
        Order o3 = new Order(null, Instant.parse("2019-06-20T19:21:07Z"), OrderStatus.DELIVERED, u2);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
