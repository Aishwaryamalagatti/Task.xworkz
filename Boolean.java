public class Boolean{
public static void main(String[] args)
{
System.out.println(" Determine");
arrayOfFruits();
}
public static void arrayOfFruits()
{
System.out.println("Invoking method");
boolean strawberryIsRedColor=true;
boolean mangoIsBitter=false;
boolean bananaIsRound=false;
boolean kiwiIsGoodForHealth=true;

boolean[] fruits={strawberryIsRedColor,mangoIsBitter,bananaIsRound,kiwiIsGoodForHealth};
int sizeOfArray=fruits.length;
System.out.println("size of array:"+ sizeOfArray);
boolean elementAtIndex1=fruits[1];
System.out.println("elementAtIndex one:"+ elementAtIndex1);
}
}