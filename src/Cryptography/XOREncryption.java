package Cryptography;

import java.util.Random;

public class XOREncryption 
{

	public static void main(String[] args) 
	{
		//String klartext = "1010101";
		//String key = generateKey(klartext.length());
		
		String klartext = "01101000 01100001 01101100 01101100 01101111 00100000 01101101 01100101 01101001 01101110 00100000 "
				+ "01101110 01100001 01101101 01100101 00100000 01101001 "
				+ "01110011 01110100 00100000 01100110 01101100 01101111 01110010 01101001 01100001 01101110 00100000 01101011 "
				+ "01101111 01110000 01110000";
		String key = generateKey(klartext.length());
		
		System.out.println("Schlüssel: " + key);
		System.out.println(encrypt(klartext, key));
	}
	
	public static String encrypt(String plaintext, String key)
	{
		//prüft, ob klartext und Schlüssel gleich lang sind
		if (plaintext.length() != key.length())
			throw new IllegalArgumentException("key is not as long as the plaintext");
		
		StringBuilder b = new StringBuilder();
		
		//speichert das Ergebnis einer XOR-Operation 
		for(int i=0; i<plaintext.length(); i++)
		{
			if (plaintext.charAt(i) != ' ')
				b.append((Integer.valueOf(plaintext.charAt(i)) ^ Integer.valueOf(key.charAt(i))));
		}
		
		return b.toString();
	}
	
	public static String decrypt(String chipher, String key)
	{
		if (chipher.length() != key.length())
			throw new IllegalArgumentException("key is not as long as the chipher");
		
		StringBuilder b = new StringBuilder();
		
		for(int i=0; i<chipher.length(); i++)
		{
			b.append((Integer.valueOf(chipher.charAt(i)) ^ Integer.valueOf(key.charAt(i))));
		}
		
		return b.toString();
	}
	
	
	
	public static String generateKey(int keyLength)
	{
		StringBuilder b = new StringBuilder();
		Random r = new Random();
		
		for (int i=0; i<keyLength; i++)
			b.append(r.nextInt(2));
		
		return b.toString();
	}

}
