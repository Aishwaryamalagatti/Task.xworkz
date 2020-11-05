public class CountryTest{
	public static void main(String[] args){
		System.out.println("JVM invoked main");
		
		String country=Country.countryName;
		System.out.println("My country name is:   "+country);
			
	    byte states=Country.states;
		System.out.println("Total no of states in India are:  "+states);
				
	    short languages=Country.noOfLanguages;
		System.out.println("No of languages in India are:   "+languages);
				
		 String state=Country.myState;
		System.out.println("My state is:   "+state);
				
		 long population=Country.populationOfKarnataka;
		System.out.println("Population of Karnataka is: "+population);
			}
}