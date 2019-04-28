package com.giga.inventory.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.giga.inventory.model.Person;
import com.giga.inventory.repository.PersonRepository;

@EnableMongoRepositories(basePackageClasses = PersonRepository.class)
@Configuration
public class MongoDBConfig {
	

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return strings -> {
        	personRepository.save(new Person("Peter", "Development","45"));
        	personRepository.save(new Person("Sam", "Operations", "67"));
        };
    }

}
