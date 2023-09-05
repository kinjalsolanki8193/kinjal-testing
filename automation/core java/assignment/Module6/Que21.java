package Module6;

import java.util.ArrayList;

public class Que21 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default size is..."+a1.size());
		System.out.println("Default Value is...."+a1);
		a1.add(123);
		a1.add('K');
		a1.add(85.26f);
		a1.add("Kinjal");
		a1.add(new Integer(100));
		a1.add("Kinjal");
		System.out.println("All the array...");
		
		a1.remove(3);
		System.out.println("After removal..."+a1);
		
	}
}	

