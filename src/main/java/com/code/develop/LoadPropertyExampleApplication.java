package com.code.develop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:email.properties")
@SpringBootApplication
public class LoadPropertyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadPropertyExampleApplication.class, args);
	}

}
