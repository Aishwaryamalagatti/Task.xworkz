public class InstituteFinder{
public static void lowestAndBestUsingString(String instituteName)
{
	System.out.println("Invoked lowestAndBestUsingString");
	System.out.println("arg 1 institutename:"+ instituteName);
	switch(instituteName)
	{
case "XWORKZ":
		System.out.println("case is " +instituteName);
		System.out.println("Enterprise development");
		System.out.println("cost is 20k");
		break;
case "ABC":
		System.out.println("case is " +instituteName);
		System.out.println("Java");
		System.out.println("cost is 30k");
		break;
case "JSPIDERS":
		System.out.println("case is " +instituteName);
		System.out.println("Java and JEE");
		System.out.println("cost is 32k");
		break;
case "PENTAGON":
		System.out.println("case is " +instituteName);
		System.out.println("Python");
		System.out.println("cost is 50k");
		break;
case "SOCKEXPERTS":
		System.out.println("case is " +instituteName);
		System.out.println("Cyber security");
		System.out.println("cost is 40k");
		break;
default:
		System.out.println("institute not found,hence executing default");
	}
	System.out.println(" Exit lowestAndBestUsingString");
	}
	
	
public static void lowestAndBestUsingEnum(Institute instituteName)
{

System.out.println("invoked lowestAndBestUsingEnum");
	System.out.println("arg 1 instituteName "+instituteName);	
	switch(instituteName){
		case XWORKZ:
				System.out.println("case is " +instituteName);
				System.out.println("Enterprise development");
				System.out.println("cost is 20k");
				break;
		case ABC:
				System.out.println("case is " +instituteName);
				System.out.println("Java");
				System.out.println("cost is 30k");
				break;
		default :
				System.out.println("no institute matched");
	}
	
	System.out.println("EXIt:: lowestAndBestUsingEnum");
}
}
		