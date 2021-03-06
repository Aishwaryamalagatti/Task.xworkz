package com.xworkz.solution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MailTester {

	public static void main(String[] args) {

		Collection<String> mail = new ArrayList();
		mail.add("aishwarya@gmail.com");
		mail.add("apoorva@gmail.com");
		mail.add("anil@gmail.com");
		mail.add("shashikala@gmail.com");
		mail.add("anusha@gmail.com");
		mail.add("aditi@gmail.com");
		mail.add("prashant@gmail.com");
		mail.add("radha@gmail.com");
		mail.add("kavya@gmail.com");
		mail.add("keerti@gmail.com");
		mail.add("krutika@gmail.com");
		mail.add("kushal@gmail.com");
		mail.add("kartik@gmail.com");
		mail.add("komal@gmail.com");
		mail.add("savita@gmail.com");
		mail.add("sunita@gmail.com");
		mail.add("kavita@gmail.com");
		mail.add("sudeesh@gmail.com");
		mail.add("sudeesh@gmail.com");
		mail.add("savita@gmail.com");

		
		int totalNo=mail.size();
		System.out.println("Total Mobile numbers "+totalNo);
		System.out.println(mail);
		
		Collection<String> tempEmails = new ArrayList();
		
		Iterator<String> iterator = mail.iterator();
		while (iterator.hasNext()) {
			
			String str = iterator.next();
			if (tempEmails.contains(str)) {
				iterator.remove();
			} else {
				tempEmails.add(str);
			}

		}
		System.out.println("emails after removing duplicates " + tempEmails);
		System.out.println(tempEmails.size());
	}
	}