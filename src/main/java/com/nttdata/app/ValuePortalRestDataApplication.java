package com.nttdata.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.app.model.Customer;
import com.nttdata.app.repository.CustomerRepository;

@SpringBootApplication
public class ValuePortalRestDataApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ValuePortalRestDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(new Customer("Firstname1", "Lastname1"));
		customerRepository.save(new Customer("Firstname2", "Lastname2"));
		customerRepository.save(new Customer("Firstname3", "Lastname3"));
		customerRepository.save(new Customer("Firstname4", "Lastname4"));
		customerRepository.save(new Customer("Firstname5", "Lastname5"));
	}
}
