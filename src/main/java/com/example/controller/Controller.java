package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/home")
		public String getHome() {
		
			return "home";
		}
	@GetMapping("serviceproduct")
	public String getServiceProduct() {
		
		String products = restTemplate.getForObject("http://localhost:8082/product", String.class);
		return products;
	}
	
	
}
