public class Country{
		
	public static void main(String[] accessories)
	{
		System.out.println("JVM invoked main");	
      String country="Russia";		
	  
		countryName("India");		
		countryName(null);			
		countryName(country);
		
		System.out.println("main method exit");
	}
	public static void countryName(String name)
	{
		System.out.println("invoked countryName" + name);
	}
}