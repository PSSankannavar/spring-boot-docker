package com.java.consumer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {
	
	
	@GetMapping("/")
	public String consumer(){
		return "Hi, I'm Consumer";
	}
	
	@GetMapping("/consumer/{name}")
	public String producer(@PathVariable String name){
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("name", name);
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/producer/{name}", String.class,uriVariables);
		return forEntity.getBody();
	}

}
