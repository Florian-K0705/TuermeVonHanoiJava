package Cryptography.rsa.keysGenerator;

import java.math.BigInteger;
import java.util.Random;

public class Keys {
	
	
	private BigInteger[] publicKey = new BigInteger[2];
	private BigInteger[] privateKey = new BigInteger[2];
	
	private BigInteger q;
	private BigInteger p;
	
	private int n;
	
	public Keys(int n)
	{
		this.n = n;
	}

	
	public void generateKeys()
	{
		System.out.println("Starte Schlüsselberechnung...");
		
		q = BigRandomPrimeNumber.getNumber(n);
		p = BigRandomPrimeNumber.getNumber(n);
		System.out.println("p und q berechnet.");
		
		BigInteger n = p.multiply(q);
		System.out.println("n berechnet.");
		
		BigInteger phi = (p.subtract(new BigInteger("1"))).multiply(q.subtract(new BigInteger("1")));
		System.out.println("phi(n) berechnet.");
		
		BigInteger e = getE(phi);
		System.out.println("e berechnet.");
		BigInteger d = getD(e, phi);
		System.out.println("d berechnet.");
		
		publicKey[0] = n;
		privateKey[0] = n;
		
		publicKey[1] = e;
		privateKey[1] = d;
		
		System.out.println("Schlüsselberechnung beendet.");
	}
	 
	public BigInteger getE(BigInteger phi)
	{
		ExtendedEuklid euklid = new ExtendedEuklid();
		
		BigInteger e = new BigInteger(String.valueOf((new Random().nextInt(10000)) + 3));
		
		euklid.bigExtendetEuklid(e, phi);
		
		while (!(euklid.g.compareTo(new BigInteger("1")) == 0))
		{
			e = new BigInteger(String.valueOf((new Random().nextInt(10000)) + 3));
			euklid.bigExtendetEuklid(e, phi);
		}
		
		return e;
		
	}
	
	
	public BigInteger getD(BigInteger e, BigInteger phi)
	{
		ExtendedEuklid euklid = new ExtendedEuklid();
		euklid.bigExtendetEuklid(e, phi);
		
		return euklid.u;
	}
	
	public BigInteger[] getPublicKey() {
		return publicKey;
	}


	public BigInteger[] getPrivateKey() {
		return privateKey;
	}

}
