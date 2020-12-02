package com.xworkz.copies;
import com.xworkz.copies.init.Paper;

public class PaperTester {

	public static void main(String[] args) {

		Paper paper=new Paper("Classmate",6,10,"white");
		String brandName=paper.getBrandName();
		float width=paper.getWidth();
		float length=paper.getLength();
		String color=paper.getColor();
		
		System.out.println(brandName);
		System.out.println(width);
		System.out.println(length);
		System.out.println(color);
		
		paper.setColor("Blue");
		color=paper.getColor();
		System.out.println("Updated color:"+color);

		
	}

}
 

