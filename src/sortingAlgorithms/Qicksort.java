package sortingAlgorithms;


public class Qicksort
{

	public static void main(String[] args) 
	{
		int[] a = RandomArray.create(1000);
		int[] b = sort(a, 0, a.length-1);
		//System.out.println(Arrays.toString(b));
	}
	
	private static int[] sort(int[] toSort, int start, int end)
	{
		int pivot = toSort[end];
		int i = start;
		int j = end-1;
		
		
		while (i < j)
		{
			
			if (toSort[i] > pivot)
			{
				if (toSort[j] <= pivot)
				{
					swap(toSort, i, j);
					i++;
				}
				else
					j--;
			}
			else
				i++;
			
		}
		
		
		if (toSort[i] > pivot)
		{
			swap(toSort, i, end);
		}
		
		
		if (start < end) 
		{
			sort(toSort, start, i);
			sort(toSort, i+1, end);
		}
		
		return toSort;
	}
	
	
	private static int[] swap(int[] list, int pos1, int pos2)
	{
		int current_pos = list[pos1];
		list[pos1] = list[pos2];
		list[pos2] = current_pos;
		
		return list;
	}
	

}