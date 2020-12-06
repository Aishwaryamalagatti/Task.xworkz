package com.xworkz.methods.electronic;

public class MovieHub {

	private String theatreName;
	private int totalTicket;
	private String[] movieNames;

	public MovieHub(String theatreName,int totalTicket,String[] movieNames)
	{
		System.out.println("created and initialized MovieHub************");
		System.out.println("arg1:" + theatreName);
		System.out.println("arg2:" + totalTicket);
		System.out.println("arg3:" + movieNames);

		this.theatreName = theatreName;
		this.movieNames = movieNames;
		this.totalTicket = totalTicket;
		System.out.println("initialised completed*************");
	}
	public double bookTicketsAndgetTotalprice(String movieName,int noOfTickets,String bookedBy )
	{
	 double totalPrice=0;
	System.out.println("");
	for(int t=0;t<movieName.length();t++) {
		String movie=movieNames[t];
		if(movieNames.equals(movie)) {
			System.out.println("movie found,can book ticket");
			break;
		}
		else {
			System.out.println("movie not found");
		}
	}
	if(noOfTickets<=totalTicket) {
		System.out.println("total tickets available:"+totalTicket);
		totalTicket=totalTicket-noOfTickets;
		System.out.println("remaining tickets are:"+totalTicket);
	}
	else {
		System.out.println("There are no tickets");
	}
	return totalPrice;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public int getTotalTicket() {
		return totalTicket;
	}
	public String[] getMovieNames() {
		return movieNames;
	}
	
}