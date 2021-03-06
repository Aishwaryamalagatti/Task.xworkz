package com.xworkz.StringTest;

public class Replace {
	public static String replacing(String str ,String name) {
		System.out.println(str);
		String msg = str.replaceAll("name",name );
		return msg;
	}

	public static void main(String[] args) {
		String strrename = replacing("Hi name,Welcome to the String execution.","Aishwarya");
		System.out.println(strrename);
	}

}
