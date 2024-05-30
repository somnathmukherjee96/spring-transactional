package com.som.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringTransactionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionalApplication.class, args);
	}

}
