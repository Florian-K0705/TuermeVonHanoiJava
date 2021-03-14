package numberTheory;

import java.math.BigInteger;
import java.util.Scanner;

public class FermatschePrimazahlTest
{

	public static void main(String[] args) 
	{
		System.out.println(fermatTestForBigInteger(34876L));
	}
	
	public static boolean fermatTestForBigInteger(long prime)
	{
		boolean result = false;
		BigInteger primeNumber = new BigInteger(String.valueOf(prime));
		BigInteger a = findCoprimeNumber(prime);
		BigInteger eins = new BigInteger("1");
		BigInteger p = new BigInteger(String.valueOf(1 % prime));
		
		if (a.modPow(primeNumber.subtract(eins), primeNumber).compareTo(p) == 0)
		{
			result = true;
		}
		
		return result;
	}
	
	//Findet eine beliebige Zahl i, die zu n teilerfremd ist.
	public static BigInteger findCoprimeNumber(long n)
	{
		int n2 = (int)n;
		BigInteger i = new BigInteger("2");
		BigInteger eins = new BigInteger("1");
		
		while (Euklidischer_Algorithmus.euklidischerAlgorithmus2(n2, Integer.parseInt(i.toString())) != 1)
		{
			i.add(eins);
		}
		
		return i;
	}

}
