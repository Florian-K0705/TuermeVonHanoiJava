package analysis;

import analysis.functions.Function;

public class NumericalIntegration 
{
	/**
	 * 
	 * @param f
	 * @param a
	 * @param b
	 * @param n
	 * @return The integral between a and b of f with accuracy n.
	 */
	public static double integral(Function f, double a, double b, int n)
	{
		double l = (b-a)/n; 
		double r=0;
		
		for (double i=a; i<b; i+=l)
		{
			r += l * f.f(i);
		}
		
		return r;
	}
	
	// TODO Simpsonregel implementieren 
	
	// TODO Mittelpunktsregel implementieren 
	
	// TODO Trapezregel implementieren 

}
