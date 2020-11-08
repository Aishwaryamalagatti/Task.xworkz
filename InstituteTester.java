public class InstituteTester{
public static void main(String[] photos)
{
	System.out.println("JVM invoked main, doing switch and enum");
	
InstituteFinder.lowestAndBestUsingString("XWORKZ");
String instituteName="XWORKZ";
Institute enumInstituteName=Institute.valueOf(instituteName);
InstituteFinder.lowestAndBestUsingEnum(enumInstituteName);	
	System.out.println("Exit :: main,doing switch and enum");
	}
}