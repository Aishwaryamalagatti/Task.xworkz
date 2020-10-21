public class Mail{
public static void main(String[] key)
{
System.out.println("Enter the mail-Id");
arrayOfEmail();
}
public static void arrayOfEmail()
	{
		 System.out.println("invoked arrayOfEmail");
	
		 String userEmail="abc@X-workz.in";
		 String adminEmail="admin@X-workz.in";
		 String hrEmail="xyz@x-workz.in";
		 String[] emails={userEmail,adminEmail,hrEmail,"akshara@x-workz.in"};
		 int sizeOfArray=emails.length;
		 System.out.println("Total elements "+sizeOfArray);
		 String elementAtIndex1=emails[1];
		 System.out.println("Element at index one "+elementAtIndex1);
		 String elementAtIndex2=emails[2];
		 System.out.println("Element at index two "+elementAtIndex2);
}
}

