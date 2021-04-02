package com.xworkz.software;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.software.component.SoftwareComponent;

public class SoftwareTester {

	public static void main(String[] args) {

		String xmlFileName="software.xml";
		ApplicationContext software=new ClassPathXmlApplicationContext(xmlFileName);
		SoftwareComponent ref=software.getBean(SoftwareComponent.class);
		System.out.println(ref.getVersion());
		System.out.println(ref.getType());
	}

}
