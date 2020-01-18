package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String getHome() {
		return "<h1>Welcome</h1>";
	}

	@GetMapping("/user")
	public String getUser() {
		return "<h1>Welcome user</h1>";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "<h1>Welcome admin</h1>";
	}

}
