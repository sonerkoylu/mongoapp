package com.sentek.shr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoappApplication.class, args);
	}

}
