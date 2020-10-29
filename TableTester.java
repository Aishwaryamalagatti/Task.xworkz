public class TableTester{
public static void holding(String thing)
	{
		System.out.println("invoked holding");
		System.out.println("arg thing:"+thing);
	}
public static void holding(String something,String noOfPlates)
{
	System.out.println("Invoked holding with two parameters");
	System.out.println("String and String");
	System.out.println("arg1 something"+something);
	System.out.println("arg2 noOfPlates"+noOfPlates);
}
public static void holding(String something,int noOfPlates)
{
	System.out.println("Invoked holding with two parameters");
	System.out.println("String and int");
	System.out.println("arg1 something"+ something);
	System.out.println("arg2 noOfPlates"+noOfPlates);
	}
public static void holding(int noOfPlates,String something)
{
	System.out.println("Invoked holding with two parameters");
	System.out.println("int and String ");
	System.out.println("arg1 noOfPlates"+noOfPlates);
	System.out.println("arg2 something"+something);
	}
}