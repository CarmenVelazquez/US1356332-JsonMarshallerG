package com.aa.cqe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class JsonUnmarshallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonUnmarshallerApplication.class, args);
	}

}
