package com.nyrta1.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Server1Application {

	public static void main(String[] args) {
		SpringApplication.run(Server1Application.class, args);
	}

	@GetMapping("/server1")
	public ResponseEntity<String> getMessage() {
		return ResponseEntity
				.ok("Hello from Server1");
	}
}
