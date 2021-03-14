package combinatorics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Permutations {
	
	
	public static void main(String[] args) {
		
		double[] dd = {1, 2, 3, 4, 5};
		
		List<double[]> liste = permut(dd);
		
		liste.forEach(action -> System.out.println(Arrays.toString(action)));
		
		
		
		
	}

	
	/*
	 * Maybe it is possible to run this method faster with using double[][] instead of ArrayList<double[]>
	 * Just using Arrays instead of ArrayLists could be faster but its also more difficult to implement.
	 */
	
	public static ArrayList<double[]> permut(double[] array)
	{
		ArrayList<double[]> result = new ArrayList<>();
		
		double[][] schiebeMatrix = new double[array.length][array.length];
		
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array.length; j++)
			{
				schiebeMatrix[i][j]  = array[(i+j)%array.length];
			}
		}
		
		
		double[] newArray, buildArray;
		ArrayList<double[]> tmpList;
		
		for (int i=0; i<schiebeMatrix.length; i++)
		{
			if (array.length <= 2)
			{
				result.add(schiebeMatrix[i].clone());
			}
			else
			{
				newArray = new double[schiebeMatrix[i].length-1];
				
				for (int j=0; j<schiebeMatrix[i].length-1; j++)
				{
					newArray[j] = schiebeMatrix[i][j+1];
				}
				
				tmpList = permut(newArray);
				
				
				for (double[] l : tmpList)
				{
					buildArray = new double[array.length];
					
					buildArray[0] = schiebeMatrix[i][0];
					
					for (int j=1; j<buildArray.length; j++)
					{
						buildArray[j] = l[j-1];
					}
					
					result.add(buildArray);
				}
				
				
			}
		}
		
		return result;
	}
	
}
