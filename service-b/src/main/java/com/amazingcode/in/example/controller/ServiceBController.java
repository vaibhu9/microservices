package com.amazingcode.in.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-b")
public class ServiceBController {

	@GetMapping
	public ResponseEntity<String> getMessage(){
		return ResponseEntity.ok("Hello from Service-B");
	}
}
