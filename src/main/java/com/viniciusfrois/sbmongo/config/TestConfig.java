package com.viniciusfrois.sbmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciusfrois.sbmongo.entities.User;
import com.viniciusfrois.sbmongo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository UserRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User maria = new User(null, "Maria Brown", "12345" ,"maria@gmail.com");
		User alex = new User(null, "Alex Green", "12345" ,"alex@gmail.com");
		User bob = new User(null, "Bob Grey","12345" ,"bob@gmail.com");
		User gabriela = new User(null,"Gabriela Castro","gaga123","gabrielacastro@gmail.com");
		UserRepository.saveAll(Arrays.asList(maria, alex, bob,gabriela));
		
	}

}
