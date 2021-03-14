package analysis.functions;

public class ExponentialFunction implements Function 
{
	@Override
	public double f(double x)
	{
		return Math.pow(Math.E, x);
	}

}
