package sortingAlgorithms;

import java.util.Random;

public class RandomArray 
{
	public static int[] create(int length)
	{
		int[] arr = new int[length];
		Random r = new Random();
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(100);
		}
		
		return arr;
	}
}
