package com.matiesmengo.mutationtesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MutationTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MutationTestingApplication.class, args).close();
	}
}
