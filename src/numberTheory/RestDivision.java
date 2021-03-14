package numberTheory;

public class RestDivision
{
	public static void main(String[] args)
	{
		divide(134241, 3);
	}
	
	
	public static void divide(int a, int b)
	{
		int r = a;
		int c = 0;
		while (r >= b)
		{
			r = r-b;
			c++;
		}
		
		System.out.println(c + " Rest " + r);
	}
	
}
