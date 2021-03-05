package com.viniciusfrois.sbmongo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciusfrois.sbmongo.entities.Category;
import com.viniciusfrois.sbmongo.entities.Order;
import com.viniciusfrois.sbmongo.entities.Product;
import com.viniciusfrois.sbmongo.entities.User;
import com.viniciusfrois.sbmongo.entities.enums.OrderStatus;
import com.viniciusfrois.sbmongo.repositories.CategoryRepository;
import com.viniciusfrois.sbmongo.repositories.OrderRepository;
import com.viniciusfrois.sbmongo.repositories.ProductRepository;
import com.viniciusfrois.sbmongo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository UserRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Screws");
		Category cat2 = new Category(null, "Hand Tools");
		Category cat3 = new Category(null, "construction material");
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		Product p1 = new Product(null, "Screwdriver", "A  screwdriver is a tool, manual or powered, used for screwing (installing) and unscrewing (removing) screws");
		Product p2 = new Product(null, "Sheet metal screw", "Has sharp threads that cut into a material such as sheet metal, plastic or wood");
		Product p3 = new Product(null, "Cement", "A cement is a binder, a substance used for construction that sets, hardens, and adheres to other materials to bind them together");
		Product p4 = new Product(null, "Brick", "A brick is a type of block used to build walls");
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com" ,"123","(DD) 99999-9999","999.999.999.-99");
		User alex = new User(null, "Alex Green", "alex@gmail.com" ,"123","(DD) 99999-9999","999.999.999.-99");
		User bob = new User(null, "Bob Grey","bob@gmail.com","123","(DD) 99999-9999","999.999.999.-99");
		User gabriela = new User(null,"Gabriela Castro","gabrielacastro@gmail.com","gaga123","(DD) 99999-9999","999.999.999.-99");
		
		
		UserRepository.saveAll(Arrays.asList(maria, alex, bob,gabriela));
		
		Order o1 = new Order(null, Instant.now(), bob ,OrderStatus.WAITING_PAYMENT);
		Order o2 = new Order(null, Instant.now(),maria ,OrderStatus.SHIPPED);
		Order o3 = new Order(null, Instant.now(), gabriela, OrderStatus.DELIVERED);
		Order o4 = new Order(null, Instant.now(), gabriela, OrderStatus.WAITING_PAYMENT);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3,o4));
		
		
	}

}
