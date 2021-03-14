package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] n = randomList(1000000);
		System.out.println(n.length);
		System.out.println(Arrays.toString(sort(n)));
	}
	
	public static int[] sort(int[] list)
	{
		for (int i=0; i<list.length; i++)
		{
			for (int j=0; j<list.length-1; j++)
			{
				if (list[j] > list[j+1])
				{
					swap(list, j, j+1);
				}
			}
			
		}
		
		return list;
	}
	
	
	public static int[] swap(int[] list, int pos1, int pos2)
	{
		int current_pos = list[pos1];
		list[pos1] = list[pos2];
		list[pos2] = current_pos;
		
		return list;
	}
	
	public static int[] randomList(int num)
	{
		int[] arr = new int[num];
		Random r = new Random();
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = r.nextInt(10000);
		}
		
		return arr;
	}

}
