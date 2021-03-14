package Cryptography.rsa.Encryption;

import java.math.BigInteger;
import java.util.Arrays;

import Cryptography.rsa.keysGenerator.Keys;

public class Starter 
{
	public static void main(String[] args) 
	{	
		Keys k = new Keys(10);
		k.generateKeys();
		
		BigInteger[] publicKey = k.getPublicKey();
		BigInteger[] privateKey = k.getPrivateKey();
		
		System.out.println("Public Key: " + Arrays.toString(publicKey));
		System.out.println("Private Key: " + Arrays.toString(privateKey));
		
		
		
		System.out.println("\n\nVerschlüsselung:");
		
		System.out.println((int)'a');
		
		BigInteger[] cypher = RSAKeyboardInput.encrypt("halllo", publicKey);
		System.out.println(Arrays.toString(cypher));
		
		System.out.println("Verschlüsselung beendet.");
		System.out.println("\nEntschlüsselung:");
		System.out.println(RSAKeyboardInput.decrypt(cypher, privateKey));
		
		
		
	}
	

}
