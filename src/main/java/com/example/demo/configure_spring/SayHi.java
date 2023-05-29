package com.example.demo.configure_spring;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Component("sayHi")
public class SayHi {

	private String sayHello;

	public String readTxt() {
		return sayHello;
	}

}
