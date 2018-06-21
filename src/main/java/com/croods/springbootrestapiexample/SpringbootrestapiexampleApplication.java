package com.croods.springbootrestapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootrestapiexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapiexampleApplication.class, args);
	}
}
