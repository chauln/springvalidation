package chau.springvalidation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeValidation {
	
	@GetMapping
	public Object welcome() {
		return "Welcome to gira project";
	}
}
