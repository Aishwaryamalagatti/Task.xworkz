public class Runner{
public static void main(String[] names)
	{
	System.out.println("JVM invoked main");
	System.out.println("Programs to print all the arguments of the main method");
	System.out.println("By making use of for loop,which is dynamic");
	for(int loop=0;loop<names.length;loop++)
		{
			System.out.println("looping number"+loop);
			String mainMethodArg=names[loop];
			System.out.println("main method arg "+mainMethodArg);
		}
		System.out.println("Exit:: main");
	}
}