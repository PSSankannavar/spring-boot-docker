package com.java.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer {

  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }
  
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  




}
