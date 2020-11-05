public class LoopTester{
 public static void main(String[] displays)
	{
		System.out.println("JVM invoked main");
		boolean termination=true;
		for(byte start=1;termination;start++)
			{
			System.out.println("Infinite");
			System.out.println("value of init variable:"+start);
			if(start==4)
			{
				termination=false;
			}
			}
		//System.out.println("Exit:: main");
	}
}