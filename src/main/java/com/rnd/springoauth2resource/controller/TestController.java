package com.rnd.springoauth2resource.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/secure/api/hello")
public class TestController {

	@GetMapping
	public String getHello() {
		return "Hello Resource !";
	}
	
}
