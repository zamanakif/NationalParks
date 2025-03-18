package edu.mongodb.nps.NationalParks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class NationalParksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NationalParksApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
