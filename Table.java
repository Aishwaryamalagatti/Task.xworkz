public class Table{
public static void main(String[] square)
	{
	
		System.out.println("JVM invoked main");
		System.out.println("main method args length "+ square.length);
		
		String Book="Fiction";
		TableTester.holding("Book");
		TableTester.holding(Book,8);
		TableTester.holding(2,"chair");
		
		System.out.println("Exit  main");
	}

}