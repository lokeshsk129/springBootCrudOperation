package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Indicates a configuration class that declares one or more @Bean methods 
//and also triggers auto-configuration and component scanning
public class SpringbootBackendApplication {

	public static void main(String[] args) {

		// Class that can be used to bootstrap and launch a Spring application from a
		// Java main method.
		// Create an appropriate ApplicationContext instance (depending on your
		// class path)
		// Register a CommandLinePropertySource to expose command line arguments
		// asSpring properties
		// Refresh the application context, loading all singleton beans
		// Trigger any CommandLineRunner beans
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
