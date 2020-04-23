package com.java.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	
	@GetMapping("/")
	public String producer(){
		return "Hi, I'm Produer";
	}
	

	@GetMapping("/producer/{name}")
	public String producer(@PathVariable String name){
		return "Hello " + name; 
	}
}
