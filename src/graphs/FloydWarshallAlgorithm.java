package graphs;

import java.util.Arrays;
import java.util.Random;

public class FloydWarshallAlgorithm 
{
	public static double[][] floydWarshall(Graph g)
	{
		
		double[][] D = initMatrix(g.getAdjacencyMatrix());

		
		for (int k=0; k<D.length; k++)
		{
			
			for (int i=0; i<D.length; i++)
			{
				for (int j=0; j<D.length; j++)
				{
					if (D[i][j] > D[i][k] + D[k][j])
					{
						D[i][j] = D[i][k] + D[k][j];
					}
				}
			}
			
		}
		
		return D;
	}
	
	private static double[][] initMatrix(int[][] m)
	{
		int n = m.length;
		
		double[][] matrix = new double[n][n];
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				if (i == j)
					matrix[i][j] = 0;
				else if (m[i][j] == 0)
					matrix[i][j] = Double.POSITIVE_INFINITY;
				else
					matrix[i][j] = m[i][j];
			}
		}
		
		return matrix;
		
	}
	
	public static void main(String[] args) 
	{
		
		Graph g = RandomGraph.getRandomGraph(100);

		
		double[][] r = floydWarshall(g);
		
		
		for (int i=0; i<r.length; i++)
		{
			System.out.println(Arrays.toString(r[i]));
		}
		
	}
}
