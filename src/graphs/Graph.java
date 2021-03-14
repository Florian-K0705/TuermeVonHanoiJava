package graphs;

import java.util.ArrayList;

public class Graph 
{
	private int[][] adjacencyMatrix;
	private ArrayList<Integer>[] adjacencyList;
	
	public Graph(int[][] adjacencyMatrix)
	{
		this.adjacencyMatrix = adjacencyMatrix;
		transformMatrixIntoList();
	}
	
	
	public int[][] getAdjacencyMatrix()
	{
		return this.adjacencyMatrix;
	}
	
	public void setAdjacencyMatrix(int[][] m)
	{
		this.adjacencyMatrix = m;
		transformMatrixIntoList();
	}
	
	public ArrayList<Integer>[] getAdjacencyList()
	{
		return this.adjacencyList;
	}
	
	
	@SuppressWarnings("unchecked")
	private void transformMatrixIntoList()
	{
		adjacencyList = new ArrayList[adjacencyMatrix.length];
		
		for (int i=0; i<adjacencyMatrix.length; i++)
		{
			adjacencyList[i] = new ArrayList<Integer>();
			
			for (int j=0; j<adjacencyMatrix[i].length; j++)
			{
				if (adjacencyMatrix[i][j] != 0)
				{
					((ArrayList<Integer>) adjacencyList[i]).add(j);
				}
			}
		}
	}
	
	
	public void breadtFirstSearch()
	{
		//TODO
	}
	
	public void depthFirstSearch()
	{
		//TODO
	}
	
}
