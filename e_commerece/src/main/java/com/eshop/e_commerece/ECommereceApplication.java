package com.eshop.e_commerece;


import com.eshop.e_commerece.model.Address;
import com.eshop.e_commerece.model.Role;
import com.eshop.e_commerece.model.Users;
import com.eshop.e_commerece.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.LinkedList;


@SpringBootApplication
@EnableJpaRepositories
public class ECommereceApplication implements CommandLineRunner {

	@Autowired
	private UsersService usersService;

	public static void main(String[] args) {
		SpringApplication.run(ECommereceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

//		Users users = new Users("Farhan" , "Khalid" , "+36202832737" , "fkhalid1991@gmail.com", "123456",
//				new Address("Garay Utca 12", "Pecs" , "Baranya", "7623" ,"Hungary"));
	}
}
