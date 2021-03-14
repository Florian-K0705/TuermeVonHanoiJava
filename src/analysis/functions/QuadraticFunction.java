package analysis.functions;

public class QuadraticFunction implements Function
{
	public int a = 1;
	public int b = 0;
	public int c = 0;
	
	@Override
	public double f(double x)
	{
		return a*(x*x) + b*x + c;
	}
}
