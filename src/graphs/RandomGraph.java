package graphs;

import java.util.Random;

public class RandomGraph {

	public static Graph getRandomGraph(int n)
	{
		int[][] am = new int[n][n];
		
		Random random = new Random();
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				am[i][j] = random.nextInt(n);
			}
		}
		
		return new Graph(am);
	}
	
}
