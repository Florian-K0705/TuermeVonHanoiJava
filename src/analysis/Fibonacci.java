package analysis;

public class Fibonacci 
{
	/**
	 * 
	 * @param n
	 * @return The first n Fibonaccinumbers
	 * 
	 * This Method calculates the first n Fibonaccinumbers and safes them in 
	 * in long Array.
	 * 
	 * The Sequence starts with f(1) = 1. f(0) is not is not defined.
	 * 
	 */
	public static long[] fibonacci(int n)
	{
		if (n <= 0)
			return null;
		
		long[] result = new long[n];
		result[0] = 1;
		
		if (n == 1)  return result;
		
		result[1] = 1;
		
		for (int i=2; i < n; i++)
		{
			result[i] = result[i-1] + result[i-2];
		}
		
		return result;
		
	}
}
