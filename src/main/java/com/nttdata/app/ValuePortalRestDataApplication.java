package com.nttdata.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.app.model.Idea;
import com.nttdata.app.repository.ValueCreationIdeaRepository;

@SpringBootApplication
public class ValuePortalRestDataApplication implements CommandLineRunner{
	
	@Autowired
	ValueCreationIdeaRepository valueCreationIdeaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ValuePortalRestDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		valueCreationIdeaRepository.save(new Idea("Mahant Idea", "classification", "account", "hardwareReq", "softwareReq", "problem", "solution", "benefit", "detailedDesc", "userId", "status", null, "ideaFor", "accSpecific", "location", "theme", "yes"));
	}
}
