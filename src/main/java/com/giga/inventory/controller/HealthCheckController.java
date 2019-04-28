package com.giga.inventory.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
	
	@RequestMapping("/ping")
	public String healthcheck(){
		return "Inventory Service is Alive";
	}
	

}
