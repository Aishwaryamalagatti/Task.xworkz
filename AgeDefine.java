public class AgeDefine{
	public static void main(String[] person){
		System.out.println("JVM invoked main");
		
		String ageInString=person[0];
		int age=Integer.parseInt(ageInString);
		String ageValue=Age.ageDefine(age);
		System.out.println("The person with this age is  "+ageValue);
		System.out.println("Exit from main");

	}
}
