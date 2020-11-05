public class VTU{
public static void printMessage()
{
	for(byte msg=0;msg<=4;msg++)
	{
	System.out.println("Shaping your future");
	}
}
public static void printMessage(int loopSize)
{
	for(int msg=0;msg<=loopSize;msg++)
	{
		System.out.println("Shaping your future"+msg);
	}
}

public static void groupMessagesAndLoop()
{
	System.out.println("Invoked groupMessagesAndLoop");
	String[] messages={"Good morning","Have a good day","Enjoy your day","Live life to the fullest","Learn something everyday"};
	System.out.println("Size of the message:"+messages.length);
	
	for(int count=0;count<messages.length;count++)
	{
		System.out.println("count: "+count);
		String message=messages[count];
		System.out.println("message :"+message);
	}
	}
}