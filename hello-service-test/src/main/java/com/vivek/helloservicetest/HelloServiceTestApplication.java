package com.vivek.helloservicetest;


import com.vivek.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HelloServiceTestApplication {


	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(HelloServiceTestApplication.class, args);
		HelloService helloService =(HelloService) context.getBean("helloService");
		helloService.m1();

		//Here the helloSerive is automatically configured by the spring by just adding the
		//the following dependency which has the autoconfiguration code
		//which contains default implementation for HelloService interface...
		//Here if we have our own implementation for HelloService interface class..
		// then our own methods will get executed when helloService.m1() is ran...
//		<dependency>
//			<groupId>com.vivek</groupId>
//			<artifactId>hello-service-autoconfigure</artifactId>
//			<version>0.0.5-SNAPSHOT</version>
//		</dependency>

	}

}
