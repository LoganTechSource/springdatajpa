package com.logantechsource.h2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class H2DbSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DbSampleApplication.class, args);
	}
}
