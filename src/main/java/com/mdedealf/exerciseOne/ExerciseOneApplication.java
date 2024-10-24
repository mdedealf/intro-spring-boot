package com.mdedealf.exerciseOne;

import com.mdedealf.exerciseOne.products.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExerciseOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseOneApplication.class, args);
	}

}
