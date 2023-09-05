package Module6;
//WAP to Company Two string.
public class Que13 
{
	public static void main(String[] args) 
	{
		String a="Kinjal";
		String b=new String("Kinjal");
		String c=new String("kinjal");
		System.out.println("Using double equals.....      "+(a==b));
		System.out.println("Using equal ()...       "+a.equals(b));
		System.out.println("This is case sensitive....       "+b.equals(c));
		System.out.println("This is not case sensitive....     "+b.equalsIgnoreCase(c));
		System.out.println("compare a and b using compare To...   "+a.compareTo(b));
		System.out.println("compare a and c using compare To...    "+a.compareTo(c));
		System.out.println("compare b and c using compareTo...."+b.compareTo(c));
	}
}