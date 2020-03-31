package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        
   
    @GetMapping("/{firstName}/{lastName}")
        public String hello(@PathVariable("firstName") String firstName,
                            @PathVariable("lastName") String lastName){
            return String.format("hello %s %s",firstName,lastName);
        }
    @
        
    
        
}
