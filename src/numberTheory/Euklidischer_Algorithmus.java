package numberTheory;

public class Euklidischer_Algorithmus
{

	public static void main(String[] args) 
	{
		int a = euklidischerAlgorithmus(693, 286);
		System.out.println(a);
	}
	
	//Berechnet den GGT zweier Zahlen. Rekursiv.
	public static int euklidischerAlgorithmus(int a, int b)
	{
		
		if (a < 0 | b < 0)
			throw new IllegalArgumentException("Du darfst nur positive Zahlen angeben!");
		
		if (a != b)
		{
			if (a < b)
			{
				int current = a;
				a = b;
				b = current;
			}
			
			a = a - b;
			a = euklidischerAlgorithmus(a, b);
		}
		
		
		return a;
	}
	
	//Berechnet den GGT zweier Zahlen. Iterativ.
	public static int euklidischerAlgorithmus2(int a, int b)
	{
		int current = a % b;
		while (current > 0)   
		{
			a = b;
			b = current;
			current = a % b;
		}
		
		return b;
	}

}
