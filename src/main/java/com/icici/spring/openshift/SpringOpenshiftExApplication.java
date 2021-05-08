package com.icici.spring.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftExApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome Kunal";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hi "+input+" Your application deployed successfully at openshift......";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftExApplication.class, args);
	}

}
