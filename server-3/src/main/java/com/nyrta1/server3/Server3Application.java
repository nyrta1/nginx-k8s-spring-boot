package com.nyrta1.server3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server3Application {

	public static void main(String[] args) {
		SpringApplication.run(Server3Application.class, args);
	}

	@GetMapping("/server3")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity
				.ok("Hello from Server3");
	}
}
