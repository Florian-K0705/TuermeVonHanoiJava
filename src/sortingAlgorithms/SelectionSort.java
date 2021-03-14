package sortingAlgorithms;

public class SelectionSort
{

	public static int[] array = RandomArray.create(100000);
	
	public static void main(String[] args) 
	{
		sort();
	}
	
	public static void sort()
	{
		int start = 0;
		int stop = array.length-1;
		int tmp;
		
		while (start <= stop)
		{
			tmp=start;
			
			for (int i=start+1; i<=stop; i++)
			{
				if (array[i] < array[tmp])
				{
					tmp = i;
				}
			}
			
			
			swap(start, tmp);
			start++;
		}
	}
	
	public static void swap(int p1, int p2)
	{
		int c = array[p1];
		array[p1] = array[p2];
		array[p2] = c;
	}
	
}
