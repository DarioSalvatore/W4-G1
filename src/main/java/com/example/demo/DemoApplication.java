package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configure_spring.SayHi;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		sayHallo();
	}

	public static void sayHallo() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.example.demo.configure_spring");
		ctx.refresh();
		SayHi ciao = (SayHi) ctx.getBean("sayHi");
		ciao.setSayHello("Hello World!");

		System.out.println(ciao.readTxt());

		ctx.close();

	}

}
