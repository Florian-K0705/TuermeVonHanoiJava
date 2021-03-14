package Cryptography.rsa.Encryption;

import java.math.BigInteger;

public class RSAKeyboardInput 
{
	
	public static BigInteger[] encrypt(String plainText, BigInteger[] publicKey)
	{
		
		BigInteger[] result = new BigInteger[plainText.length()];
		
		BigInteger tmp;
		
		for (int i=0; i<plainText.length(); i++)
		{
			tmp = new BigInteger(String.valueOf((int) plainText.charAt(i)));
			
			result[i] = tmp.modPow(publicKey[1], publicKey[0]);
		}
		
		
		return result;
	}
	
	public static String decrypt(BigInteger[] cypher, BigInteger[] privateKey)
	{
		
		StringBuilder builder = new StringBuilder();
		BigInteger tmp;
		
		for (int i=0; i<cypher.length; i++)
		{
			tmp = cypher[i];
			
			builder.append((char) tmp.modPow(privateKey[1], privateKey[0]).intValue());
		}
		
		return builder.toString();
	}
	
	
}
