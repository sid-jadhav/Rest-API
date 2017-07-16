package com.org.api.springRESTFullWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan //scan for all the controller in the project
@EnableAutoConfiguration  //auto configure the spring dispatcher servelet 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); 
		//starts a embedded tomcat container
		//will run restdul component in it

	}

}
