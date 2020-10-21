public class Degree{
public static void main(String[] args)
{
System.out.println("Percentage of Students");
arrayOfPercentage();
}
public static void arrayOfPercentage()
{
System.out.println("Invoking method");
float primaryPercentage=95.2f;
float highSchoolPercentage=90.2f;
float pucPercentage=80;
float degreePercentage=75.4f;
float[] percentage ={primaryPercentage, highSchoolPercentage,pucPercentage,degreePercentage};
int sizeOfArray=percentage.length;
System.out.println("Total elements:"+ sizeOfArray);
float elementAtIndex3=percentage[3];
System.out.println("element At Index three:"+ elementAtIndex3);
} }