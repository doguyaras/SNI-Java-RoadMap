package com.example.springintro;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beans.xml");

		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.add();

	}

}
