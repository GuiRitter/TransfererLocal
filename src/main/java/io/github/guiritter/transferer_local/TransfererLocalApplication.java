package io.github.guiritter.transferer_local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TransfererLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransfererLocalApplication.class, args);
	}
}
