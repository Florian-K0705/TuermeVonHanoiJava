package Cryptography.rsa.keysGenerator;

import java.math.BigInteger;
import java.util.Random;

public class BigRandomPrimeNumber 
{
	public static BigInteger getNumber(int n)
	{
		Random r = new Random();
		StringBuilder builder = new StringBuilder();

		for (int i=1; i<=n; i++)
		{
			builder.append(r.nextInt(10));
		}
		
		BigInteger number = new BigInteger(builder.toString());
		
		BigInteger one = new BigInteger("2");
		
		
		if (number.mod(new BigInteger("2")).equals(new BigInteger("0")))
		{
			number = number.add(new BigInteger("1"));
		}
		
		while (!number.isProbablePrime(1000))
		{
			number = number.add(one);
		}
		
		return number;
	}

}
