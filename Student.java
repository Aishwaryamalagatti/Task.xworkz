public class Student{
	
	public static void rollnumber(int number){
		System.out.println("invoked  rollnumber with one parameters ");
		System.out.println("arg number :"+number);
	}

	public static void  rollnumber(int number,String studentName){
		System.out.println("invoked rollnumber with two parameters ");
		System.out.println("arg1 number :"+number);
		System.out.println("arg2 studentName :"+studentName);
	}	
	
	public static void  rollnumber(String number,String studentName){
		System.out.println("invoked  rollnumber with two parameters ");
		System.out.println("arg1 number :"+number);
		System.out.println("arg2 studentName :"+studentName);
	}
	
	public static void  rollnumber(String studentName,int number){
		System.out.println("invoked rollnumber with two parameters ");
		System.out.println("arg1 studentName :"+studentName);
		System.out.println("arg2 number :"+number);
	}
	
}