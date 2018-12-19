package com.nttdata.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.app.model.Customer;
import com.nttdata.app.model.Idea;
import com.nttdata.app.repository.CustomerRepository;
import com.nttdata.app.repository.ValueCreationIdeaRepository;

@SpringBootApplication
public class ValuePortalRestDataApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ValueCreationIdeaRepository valueCreationIdeaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ValuePortalRestDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(new Customer("Firstname1", "Lastname1"));
		valueCreationIdeaRepository.save(new Idea("Mahant Idea", "problem", "solution", "benefit", "detailedDesc", "Mahant", "submitted", null));
	}
}
