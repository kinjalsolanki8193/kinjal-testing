package Module7;

import org.testng.annotations.Test;

public class Q18 
{
	@Test(groups = {"car"})
	public void car1()
	{
		System.out.println("Audi is a car");
	}
	
	@Test(groups = {"bike"})
	public void bike1()
	{
		System.out.println("KTM is a bike");
	}
	
	@Test(groups = {"car"})
	public void car2()
	{
		System.out.println("Bmv is a car");
	}
	
	@Test(groups = {"truck"})
	public void truck1()
	{
		System.out.println("Bharat Benz is a truck");
	}
	
	@Test(groups = {"car"})
	public void car3()
	{
		System.out.println("Toyota is a car");
	}
	
	@Test(groups = {"truck"})
	public void truck2()
	{
		System.out.println("Tata prima is a truck");
	}
	@Test(groups = {"bike"})
	public void bike2()
	{
		System.out.println("kawasaki is a bike");
	}
	
	@Test(groups = {"bike"})
	public void bike3()
	{
		System.out.println("Royal Enfield is a Bike");
	}
}	
	
