package numberTheory;

public class HeronVerfahren {
	
	//Das Heron-Verfahren nutzt das Newton-Verfahren zur Berechnung der
	//Nullstellen, denn aus x^2=a folgt: 0=x^2-a
	

	public static void main(String[] args) 
	{
		double a = sqrt(453987218);
		System.out.println(a);
	}
	
	public static double sqrt(double root)
	{
		double startwert = (root+1)/2;
		return iteration(root, startwert, 0);
	}
	
	private static double iteration(double root, double x, int eps)
	{
		x = (x + root/x) / 2;
		eps++;
		
		if (eps <= 3)
			x = iteration(root, x, eps);
		
		return x;
	}

}
