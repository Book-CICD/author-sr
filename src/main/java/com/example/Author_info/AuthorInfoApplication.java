package com.example.Author_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AuthorInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorInfoApplication.class, args);
	}

}
