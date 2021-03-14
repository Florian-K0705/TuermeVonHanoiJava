package Cryptography.rsa.keysGenerator;

import java.math.BigInteger;

public class ExtendedEuklid 
{
	
	public BigInteger g, u, v;

	
	/*
	 * Fremder Code!!! aber trotzdem nützlich. Die BigInteger-Variante kommt aber von mir.
	 */
	
	public void bigExtendetEuklid(BigInteger a, BigInteger b)
	{
		BigInteger q, r, s, t;
		
		u = new BigInteger("1");
		t = new BigInteger("1");
		v = new BigInteger("0");
		s = new BigInteger("0");
		
		while (b.compareTo(new BigInteger("0")) == 1)
		{
			q=a.divide(b);
			r=a.subtract(q.multiply(b)); a=new BigInteger(b.toString()); b=new BigInteger(r.toString());
			r=u.subtract(q.multiply(s)); u=new BigInteger(s.toString()); s=new BigInteger(r.toString());
			r=v.subtract(q.multiply(t)); v=new BigInteger(t.toString()); t=new BigInteger(r.toString());
		}
		
		g=new BigInteger(a.toString());
	}

}
