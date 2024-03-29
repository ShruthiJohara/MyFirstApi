package com.api.psd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {

	@GetMapping("/")
	public ResponseEntity<String> getName() {
		return ResponseEntity.ok("Hello World");
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<String> getName(@PathVariable String name) {
		return ResponseEntity.ok("Hello "+name);
	}
}
