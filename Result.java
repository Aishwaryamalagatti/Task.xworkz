public class Result{
public static byte resultType(double result)
{
System.out.println("Invoked result:" +result);
if(result>=0&& result<=34){
System.out.println("Student Failed");
return 1;
}
if(result>=35&& result<=50){
System.out.println("Student passed with Third class");
return 2;
}
if(result>=51&& result<=65){
System.out.println("Student passed with Second class");
return 3;
}
if(result>=66&& result<=80){
System.out.println("Student passed with First class");
return 4;
}
if(result>=81&& result<=100){
System.out.println("Student passed with Distinction");
return 5;
}
return -1;
}
}