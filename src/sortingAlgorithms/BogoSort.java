package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class BogoSort {

	public static void main(String[] args)
	{
		int[] a = RandomArray.create(12);
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] sort(int[] arr)
	{
		Random r = new Random();
		
		while (!isSorted(arr))
		{
			int a = r.nextInt(arr.length);
			int b = r.nextInt(arr.length);
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		return arr;
	}
	
	private static boolean isSorted(int[] arr)
	{
		boolean isSort = true;
		
		for (int i=0; i<arr.length-1; i++)
		{
			if (arr[i] > arr[i+1])
			{
				isSort = false;
				break;
			}
		}
		
		return isSort;
	}

}
