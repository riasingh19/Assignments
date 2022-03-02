package com.spring.security;


import com.spring.security.model.User;
import com.spring.security.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurity6Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setEmail("riasingh@gmail.com");
		user1.setUsername("Ria");
		user1.setPassword(bCryptPasswordEncoder.encode("Singh"));
		user1.setRole("ROLE_ADMIN");

		userRepo.save(user1);

		User user2 = new User();
		user2.setEmail("nikitasingh@gmail.com");
		user2.setUsername("Nikita Singh");
		user2.setPassword(bCryptPasswordEncoder.encode("Rajput"));
		user2.setRole("ROLE_NORMAL");

		userRepo.save(user2);
	}

}
