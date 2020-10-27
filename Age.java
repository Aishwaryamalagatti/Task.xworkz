public class Age{
public static byte ageLimit(double age)
{
System.out.println("Invoked age:" +age);
if(age>=1&& age<=5){
System.out.println("Given input is a kid");
return 1;
}
if(age>=6&& age<=12){
System.out.println("Given input is a child");
return 2;
}
if(age>=13&& age<=19){
System.out.println("Given input is a teen");
return 3;
}
if(age>=20&& age<=32){
System.out.println("Given input is a Adult");
return 4;
}
if(age>=33&& age<=85){
System.out.println("Given input is a old");
return 5;
}
return -1;
}
}