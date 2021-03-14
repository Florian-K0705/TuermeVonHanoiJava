package sortingAlgorithms;


public class MergeSort 
{

	public static void main(String[] args) 
	{
		int[] a = RandomArray.create(1000000);
		int[] b = sort(a);
		
	}
	
	private static int[] sort(int[] arr)
	{
		int[] sortedArr = new int[arr.length];
		
				
		if (arr.length < 2)
		{
			return arr;
		}
		
		
		int[] merge1 = sort(divide(arr, 0, arr.length/2-1));
		int[] merge2 = sort(divide(arr, arr.length/2, arr.length-1));
		
		sortedArr = combine(merge1, merge2);
		return sortedArr;
		
	}
	
	private static int[] divide(int[] arr, int start, int end)
	{
		if (start>end && start < 0  && end > arr.length)
			return null;
		
		int[] finishArr = new int[(end-start)+1];
		int j=0;
		
		for (int i=start; i<=end; i++)
		{
			finishArr[j] = arr[i];
			j++;
		}
		
		return finishArr;
	}
	
	private static int[] combine(int[] arr1, int[] arr2)
	{	
		int[] newArray = new int[arr1.length + arr2.length];
		int counter = 0; //Der Index für den neuen Array
		int pointer1 = 0; // zeigt auf das "erste" Objekte des Arrays
		int pointer2 = 0;
		
		while (pointer1 < arr1.length && pointer2 < arr2.length)
		{
			if (arr1[pointer1] < arr2[pointer2])
			{
				newArray[counter] = arr1[pointer1];
				pointer1++;
				counter++;
				
			}
			else
			{
				newArray[counter] = arr2[pointer2];
				pointer2++;
				counter++;
			}
		}
		
		
		
		if (pointer1 == arr1.length)
		{
			for (int i=pointer2; i<arr2.length; i++)
			{
				newArray[counter] = arr2[i];
				counter++;
			}
		}
		else
		{
			for (int i=pointer1; i<arr1.length; i++)
			{
				newArray[counter] = arr1[i];
				counter++;
			}
		}
		
		return newArray;
		
		
	}

}