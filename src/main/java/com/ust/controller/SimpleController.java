package com.ust.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@RequestMapping("/")
	public String getHomePage() {
		return "Dockerizing the Springboot Applicaton";
	}
	
	@RequestMapping("/docker")
	public String getDockerPage() {
		return "Buildikng and deploying Application";
	}


}
