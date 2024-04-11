package com.nyrta1.server4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server4Application {

	public static void main(String[] args) {
		SpringApplication.run(Server4Application.class, args);
	}

	@GetMapping("/server4")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity
				.ok("Hello from Server4");
	}
}
