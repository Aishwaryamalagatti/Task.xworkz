package com.xworkz.constructors;

public class ColorsTester {

	public static void main(String[] args) {
		Colors colorCode=new Colors();
		System.out.println(colorCode.name);
		
		Colors colorCode2=new Colors("Black");
		System.out.println(colorCode2.name);

		Colors colorCode3=new Colors("Black","dark");
		System.out.println(colorCode3.name);
		System.out.println(colorCode3.type);
		
		Colors colorCode4=new Colors("dark",400.0);
		System.out.println(colorCode4.type);
		System.out.println(colorCode4.depth);
		
		Colors colorCode5=new Colors(40,true);
		System.out.println(colorCode5.percent);
		System.out.println(colorCode5.color);




		
	}

}
