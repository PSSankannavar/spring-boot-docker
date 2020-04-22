package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer; 

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
