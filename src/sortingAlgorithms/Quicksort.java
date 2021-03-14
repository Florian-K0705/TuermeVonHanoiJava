package sortingAlgorithms;

import java.util.Random;

public class Quicksort 
{

	public static void main(String[] args) 
	{
		int[] a = randomList(10000000);
		
		sort(a, 0, a.length-1);
		//System.out.println(Arrays.toString(a));
	}
	
	public static int[] sort(int[] arr, int low, int high)
	{
		int i = divide(arr, low, high);
		
		if (low < high)
		{
			sort(arr, low, i);
			sort(arr, i+1, high);
		}
		
		return arr;
	}
	
	private static int divide(int[] intArr, int l, int r)
	{
		int i, j, x = intArr[(l + r) / 2]; 
        i = l - 1; 
        j = r + 1; 
        while (true) { 
            do { 
                i++; 
            } while (intArr[i] < x); 

            do { 
                j--; 
            } while (intArr[j] > x); 

            if (i < j) { 
                int k = intArr[i]; 
                intArr[i] = intArr[j]; 
                intArr[j] = k; 
            } else { 
                return j; 
            } 
        } 
	}
	
	public static int[] randomList(int num)
	{
		int[] arr = new int[num];
		Random r = new Random();
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(100);
		}
		
		return arr;
	}

}
