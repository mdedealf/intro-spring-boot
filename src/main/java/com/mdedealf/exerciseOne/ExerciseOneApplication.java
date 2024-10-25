package com.mdedealf.exerciseOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExerciseOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseOneApplication.class, args);
	}

}
