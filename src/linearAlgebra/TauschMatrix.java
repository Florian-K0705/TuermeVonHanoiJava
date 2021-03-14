package linearAlgebra;

import java.util.Arrays;

/**
 * 
 * @author florian
 * 
 * Diese Klasse stellt eine Methode zur Verfügung, die es ermöglicht, eine Matrix zu generieren,
 * die die beliebigen Zeilen r und s vertauscht.
 *
 */

public class TauschMatrix {

	
	private double[][] matrix;
	
	public TauschMatrix(double[][] m)
	{
		this.matrix = m;
	}
	
	public double[][] generateMatrix(int r, int s)
	{
		
		double[][] resultMatrix = new double[matrix.length][matrix[0].length];
		double tmp;
		
		for (int i=0; i<matrix.length; i++)
		{
			for (int j=0; j<matrix[i].length; j++)
			{
				
				if (i==j && (i!=r && i!=s))
				{
					tmp = 1;
				}
				else if (i==r && j==s)
				{
					tmp = 1;
				}
				else if (i==s && j==r)
				{
					tmp = 1;
				}
				else
					tmp = 0;
				
				
				resultMatrix[i][j] = tmp;
			}
		}
		
		
		
		return resultMatrix;
	}

}
