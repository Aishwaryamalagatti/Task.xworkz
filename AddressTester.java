//Example of Address with fields doorNo,city,streer,pincode
public class AddressTester{
public static void main(String[] home)
{
short door=Address.doorNo;
System.out.println("Door no is :"+door);
String streetname=Address.street;
System.out.println("Street name is :"+streetname);
int pin=Address.pinCode;
System.out.println("The pincode is :"+pin);
String cityname=Address.city;
System.out.println("The city name is :"+cityname);
}
}