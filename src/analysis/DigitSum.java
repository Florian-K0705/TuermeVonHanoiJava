package analysis;

import java.math.BigInteger;

public class DigitSum 
{
	/**
	 * 
	 * @param n
	 * @return The digit sum of n.
	 * 
	 * The function takes an integer and returns also an integer.
	 * 
	 */
	public static int digitSum(int n)
	{
		int sum = 0;
		String number = String.valueOf(n);
		
		for (int i=0; i < number.length(); i++)
		{
			sum += Integer.parseInt((String.valueOf(number.charAt(i))));
		}
		
		return sum;
	}
	
	
	/**
	 * 
	 * @param n
	 * @return The digit sum of n.
	 * 
	 * This function takes a BigInteger and returns its digit sum.
	 * 
	 */
	public static BigInteger digitSum(BigInteger n)
	{
		
		BigInteger sum = new BigInteger("0");
		String number = n.toString();
		
		for (int i=0; i < number.length(); i++)
		{
			sum = sum.add(new BigInteger(String.valueOf(number.charAt(i))));
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(digitSum(3456));
	}


}
