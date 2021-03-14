package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] a = RandomArray.create(100000);
		sort(new int[]{5, 4, 3, 2, 1});
		System.out.println("Fertig");
	}
	
	public static int[] sort(int[] list)
	{
		int tmp;
		int j;

		for (int i=1; i<list.length; i++)
		{
			tmp = list[i];
			j = i-1;

			while ((j>=0) && list[j] >= tmp)
			{
				list[j+1] = list[j];
				j--;
			}

			list[j+1] = tmp;

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

}
