package com.xworkz.rocket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.rocket.component.RocketComponent;

public class RocketTester {

	public static void main(String[] args) {

		String xmlFileName="rocket.xml";
		ApplicationContext rocket=new ClassPathXmlApplicationContext(xmlFileName);
		RocketComponent ref=rocket.getBean(RocketComponent.class);
	}
}
