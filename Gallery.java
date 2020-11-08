public class Gallery{
public static void main(String[] photos)
{
System.out.println("JVM invoked main,doing switch");

String storeIn=photos[0];
System.out.println("Storing value from arg:"+storeIn);
switch(storeIn){
case"Private":
	System.out.println("Store images in private folder");
	System.out.println("Store on nov");
	break;
case"Public":
	System.out.println("Store images in public folder");
	System.out.println("Store on nov");
	break;
case"Cloud":
	System.out.println("Store images incloud folder");
	System.out.println("Store on nov");
	break;
default:
	System.out.println("Cannot store images");
	}
	System.out.println("Exit::main");
}
}