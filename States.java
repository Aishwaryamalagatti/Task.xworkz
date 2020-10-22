public class States{	
	public static void main(String[] India)
	{
		System.out.println("JVM invokes main");		
		String[] statesOfIndia={"Karnataka","Maharashtra","Andhra Pradesh","Bihar","Gujarat","Haryana","Goa","Assam","Kerala","MadyaPradesh"
		,"Arunachal Pradesh","Himachal Pradesh","Rajasthan","Tamil Nadu","Tripura"};
		states(statesOfIndia);		
		System.out.println("exit main ");
	}		
	public static void states(String[] names)
	{
		
		System.out.println("states"+ names );		
		int size=names.length;
		System.out.println(size);
		String elementATIndex=names[0];
		System.out.println("state @ index 0 "+names[0]+names[8]+names[12]);
		System.out.println("state @ index 1 "+names[2]);
		System.out.println("state @ index 10 "+names[10]);
	}
	
	
}