package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MicroServiceConfig {

	@Bean
	public RestTemplate getResttemplate() {
		
		RestTemplate template = new RestTemplate();
		return template;
	}
}
