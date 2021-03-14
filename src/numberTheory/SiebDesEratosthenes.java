package numberTheory;
import java.util.Arrays;
import java.util.Vector;


//KEIN EIGENER QUELLCODE, sonder aus der Informatikklausur!!

public class SiebDesEratosthenes 
{
	boolean[] istPrimzahl;
	private int maxPrimZahl;
	
	public static void main(String[] args)
	{
		SiebDesEratosthenes s = new SiebDesEratosthenes(10010);
		int[] a = s.ausgabe();
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	}
	
	public SiebDesEratosthenes(int maxPrim)
	{
		this.maxPrimZahl = maxPrim;
		initArray(maxPrim);
		
		for (int zahl=2; zahl<Math.sqrt(maxPrim); zahl++)
		{
			if (istPrimzahl[zahl])
				markiereVielfache(zahl);
		}
	}

	private void markiereVielfache(int primzahl) 
	{
		int vielfaches = primzahl * 2;
		
		while (vielfaches < istPrimzahl.length)
		{
			istPrimzahl[vielfaches] = false;
			vielfaches = vielfaches + primzahl;
		}
	}

	private void initArray(int max) 
	{
		istPrimzahl = new boolean[max];
		
		
		for (int i=0; i<istPrimzahl.length; i++)
		{
			istPrimzahl[i] = true;
		}
	}
	
	//Umgewandelter Quellcode
	public int[] ausgabe()
	{
		Vector <Integer> list = new Vector<>();
		
		for (int ii=0; ii < istPrimzahl.length; ii++)
		{
			if (istPrimzahl[ii])
				list.add(ii);
		}
		list.add(maxPrimZahl);
		list.trimToSize();
		
		return parseInt(list.toArray(new Integer[0]));
	}
	
	
	//Eigener Quellcode
	private static int[] parseInt(Integer[] a)
	{
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
			b[i] = (int) a[i];
		}
		
		return b;
	}
}
