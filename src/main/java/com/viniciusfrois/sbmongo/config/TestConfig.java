package com.viniciusfrois.sbmongo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciusfrois.sbmongo.entities.Order;
import com.viniciusfrois.sbmongo.entities.User;
import com.viniciusfrois.sbmongo.entities.enums.OrderStatus;
import com.viniciusfrois.sbmongo.repositories.OrderRepository;
import com.viniciusfrois.sbmongo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User maria = new User(null, "Maria Brown", "12345" ,"maria@gmail.com");
		User alex = new User(null, "Alex Green", "12345" ,"alex@gmail.com");
		User bob = new User(null, "Bob Grey","12345" ,"bob@gmail.com");
		User gabriela = new User(null,"Gabriela Castro","gaga123","gabrielacastro@gmail.com");
		UserRepository.saveAll(Arrays.asList(maria, alex, bob,gabriela));
		
		Order o1 = new Order(null, Instant.now(), bob ,OrderStatus.WAITING_PAYMENT);
		Order o2 = new Order(null, Instant.now(),maria ,OrderStatus.SHIPPED);
		Order o3 = new Order(null, Instant.now(), gabriela, OrderStatus.DELIVERED);
		Order o4 = new Order(null, Instant.now(), gabriela, OrderStatus.WAITING_PAYMENT);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));
		
		
	}

}
