package com.xworkz.StringTest;

public class Convert {
	public static void main(String[] args) {
		char[] msg= ConvertToArray("Aishwarya");
		for(int i=0;i<msg.length;i++)
		{
			System.out.println("char at"+i+"index is::"+msg[i]);			
		}
	}
	
	public static char[] ConvertToArray(String name) {
		char[] convertedName=name.toCharArray();
		return convertedName;		
	}

	
}
