public class Colour{
	
	public static void colouring(int number){
		System.out.println("invoked colouring with one parameters ");
		System.out.println("number :"+number);
	}

	public static void colouring(int number,String colour){
		System.out.println("invoked colouring with two parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	}	
	
	public static void colouring(String number,String colour){
		System.out.println("invoked colouring with two string parameters ");
		System.out.println("number :"+number);
		System.out.println("colour :"+colour);
	}
	
	public static void colouring(String colour,int number){
		System.out.println("invoked colouring with two parameters ");
		System.out.println("colour :"+colour);
		System.out.println("number :"+number);
	}
	
}