public class Ten{
public static void main(String[] args)
{
System.out.println(" Student grade");
arrayOfGrades();
}
public static void arrayOfGrades()
{
System.out.println("Invoking method");
char firstStandardGrade='A';
char secondStandardGrade='A';
char thirdStandardGrade='A';
char fourthStandardGrade='A';
char fifthStandardGrade='B';
char sixthStandardGrade='B';
char seventhStandardGrade='A';
char eighthStandardGrade='C';
char ninthStandardGrade='C';
char tenthStandardGrade='B';

char[] grades={firstStandardGrade,secondStandardGrade,thirdStandardGrade,fourthStandardGrade,fifthStandardGrade,sixthStandardGrade,
seventhStandardGrade,eighthStandardGrade,ninthStandardGrade,tenthStandardGrade};
int sizeOfArray=grades.length;
System.out.println("Size of array:"+ sizeOfArray);
char elementsAtIndex4=grades[4];
System.out.println("elements At Index four:"+ elementsAtIndex4);
}
}