public class CarBrands{
public static String[] getBrands ()
{
	System.out.println("Invoked getBrands method");
	String[] carBrands={"BMW","Audi","Suzuki","Toyota","Ford","Volkswagen"};
	System.out.println("Size :"+carBrands.length);
	
	for(int brands=0;brands<carBrands.length;brands++)
	{
		System.out.println("count :"+brands);
		String cars=carBrands[brands];
		System.out.println("The car brand is :"+cars);
	}
	return carBrands;
}
}