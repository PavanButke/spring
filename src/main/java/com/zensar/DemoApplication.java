package com.zensar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"aplha", "com.zensar"})
public class DemoApplication  {

	
	public static void main(String[] args) {
		System.out.println("Hi");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Hi from CMR");
//		
//	}
//
//	@Override
//	public void run(ApplicationArguments args) throws Exception {
//	System.out.println("Hi from ApplicationArgum");
//		
//	}

}
