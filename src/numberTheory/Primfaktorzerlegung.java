package numberTheory;
import java.util.Arrays;
import java.util.Vector;

public class Primfaktorzerlegung 
{

	public static void main(String[] args) 
	{
		int zahl = 10000;
		Vector<Integer> br = new Vector<>();
		System.out.println(Arrays.toString(primFaktorZerlegung(zahl, br)));
	}
	
	public static int[] primFaktorZerlegung(int num, Vector<Integer> vr)
	{	
		SiebDesEratosthenes PrimListObject = new SiebDesEratosthenes(num);
		int[] PrimList = PrimListObject.ausgabe();
		
		for (int i=PrimList[2]; i<=PrimList.length; i++)
		{
			if ((num % PrimList[i]) == 0)
			{
				if (num != PrimList[i])
				{
					vr.add(PrimList[i]);
					return primFaktorZerlegung(num / PrimList[i], vr);
				}
				else 
				{
					vr.add(num);
					return parseInt(vr.toArray(new Integer[0]));
				}
			}
		}
		
		return null;
	}
	
	public static int[] parseInt(Integer[] a)
	{
		int[] b = new int[a.length];
		
		for (int i=0; i<a.length; i++)
		{
			b[i] = (int) a[i];
		}
		
		return b;
	}
}
