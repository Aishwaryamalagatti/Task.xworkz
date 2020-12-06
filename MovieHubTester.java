package com.xworkz.methods;

import java.util.Arrays;

import com.xworkz.methods.electronic.*;

public class MovieHubTester {

	public static void main(String[] args) {
		
		String[] movieName= {"kgf","Dia","Titanic","War"};
		MovieHub movieHub=new MovieHub("Navrang",500,movieName);
		
		System.out.println("arg1:"+movieHub.getTheatreName());
		System.out.println("arg2:"+movieHub.getTotalTicket());
		System.out.println("arg3:"+movieHub.getMovieNames());
		
		String names=Arrays.toString(movieHub.getMovieNames());
		System.out.println(names);
		
		movieHub.bookTicketsAndgetTotalprice("KGF",5,"Aishwarya");
		movieHub.bookTicketsAndgetTotalprice("KGF",420,"Aishwarya");	
		
		
	}

}
