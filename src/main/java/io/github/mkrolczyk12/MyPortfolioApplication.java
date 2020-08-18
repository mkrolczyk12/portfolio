package io.github.mkrolczyk12;

import io.github.mkrolczyk12.exceptionHandler.GeneralExceptionsProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@GeneralExceptionsProcessing
public class MyPortfolioApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyPortfolioApplication.class, args);
		System.out.println("Application started");
	}

}
