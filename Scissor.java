public class Scissor{
public static void main(String[] clothes)
{
System.out.println(" JVM invoked main ,doing switch");
String argAtIndex0=clothes[0];
int switchArg=Integer.parseInt(argAtIndex0);
switch(switchArg)
{
case 1:
		System.out.println("case one is matched");
		break;
case 2:
		System.out.println("case two is matched");
		break;
case 3:
		System.out.println("case three is matched");
		break;
case 4:
		System.out.println("case four is matched");
		break;
default:
		System.out.println("case not found,so executing default");
}
System.out.println("Exit::main");
}
}
