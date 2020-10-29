public class Actor{
	
	public static void action(String actorName)
	{
		System.out.println("invoked action with one parameters ");
		System.out.println("name :"+actorName);
	}

	public static void action(int noOfActors,String actorName)
	{
		System.out.println("invoked action with two parameters ");
		System.out.println("number of actors :"+noOfActors);
		System.out.println("name :"+actorName);
	}	
	
	public static void action(String actorName,int noOfActors)
	{
		System.out.println("invoked action with two parameters ");
		System.out.println("name :"+actorName);
		System.out.println("number of actors :"+noOfActors);
	}
	
}