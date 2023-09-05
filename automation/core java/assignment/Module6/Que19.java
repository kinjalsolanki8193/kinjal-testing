package Module6;

import java.util.ArrayList;

//WAP to iterate through all elements in an array list.
public class Que19 
{
	public static void main(String[] args) 
	{
		ArrayList <String> fruits=new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Strawberry");
		System.out.println("My fav fruits are..."+fruits);
		System.out.println("Iterated");
		ListIterator<String> iterate=fruits.listIterator();
		while (iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
	}
}	
		