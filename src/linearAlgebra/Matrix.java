package linearAlgebra;

import java.util.Arrays;

public class Matrix 
{

	private double[][] matrix;
	
	public Matrix(int n, int m) 
	{
		this.matrix = new double[n][m];
	}
	
	public Matrix(double[][] m)
	{
		this.matrix = m;
	}
	
	public Matrix(Matrix m)
	{
		this.matrix = m.getMatrix().clone();
	}
	
	public double[][] getMatrix()
	{
		return this.matrix;
	}
	
	public double get(int indexN, int indexM)
	{
		return this.matrix[indexN][indexM];
	}
	
	public void set(int indexN, int indexM, double a)
	{
		this.matrix[indexN][indexM] = a;
	}
	
	public void set(double[][] m)
	{
		this.matrix = m;
	}
	
	public void set(Matrix m)
	{
		this.matrix = m.getMatrix();
	}
	
	
	public double[] getColumnVector(int m)
	{
		double[] r = new double[matrix.length];
		
		for (int i=0; i<r.length; i++)
		{
			r[i] = matrix[i][m];
		}
		
		return r;
	}
	
	public double[] getLinesVector(int n)
	{
		return matrix[n].clone();
	}
	
	
	public void add(Matrix m)
	{
		double[][] tmp = m.getMatrix();
		
		if (tmp.length != this.matrix.length || tmp[0].length != this.matrix[0].length)
			throw new IllegalArgumentException();
		
		for (int i=0; i<tmp.length; i++)
		{
			for (int j=0; j<tmp[i].length; j++)
			{
				this.matrix[i][j] += tmp[i][j];
			}
		}
		
	}
	
	public void add(double[][] m)
	{
		double[][] tmp = m;
		
		if (tmp.length != this.matrix.length || tmp[0].length != this.matrix[0].length)
			throw new IllegalArgumentException();
		
		for (int i=0; i<tmp.length; i++)
		{
			for (int j=0; j<tmp[i].length; j++)
			{
				this.matrix[i][j] += tmp[i][j];
			}
		}
	}
	
	public void sub(Matrix m)
	{
		double[][] tmp = m.getMatrix();
		
		if (tmp.length != this.matrix.length || tmp[0].length != this.matrix[0].length)
			throw new IllegalArgumentException();
		
		for (int i=0; i<tmp.length; i++)
		{
			for (int j=0; j<tmp[i].length; j++)
			{
				this.matrix[i][j] -= tmp[i][j];
			}
		}
	}
	
	public void sub(double[][] m)
	{
		double[][] tmp = m;
		
		if (tmp.length != this.matrix.length || tmp[0].length != this.matrix[0].length)
			throw new IllegalArgumentException();
		
		for (int i=0; i<tmp.length; i++)
		{
			for (int j=0; j<tmp[i].length; j++)
			{
				this.matrix[i][j] -= tmp[i][j];
			}
		}
	}
	
	public void multiplyScalar(double l)
	{
		for (int i=0; i<this.matrix.length; i++)
		{
			for (int j=0; j<this.matrix[i].length; j++)
			{
				this.matrix[i][j] *= l;
			}
		}
	}
	
	private double absolutBiggest()
	{
		double currentBiggest = Math.abs(this.matrix[0][0]);
		double r = this.matrix[0][0];
		
		for (int i=0; i<this.matrix.length; i++)
		{
			for (int j=0; j<this.matrix[i].length; j++)
			{
				if (Math.abs(this.matrix[i][j]) > currentBiggest)
				{
					currentBiggest = Math.abs(this.matrix[i][j]);
					r = this.matrix[i][j];
				}
			}
		}
		
		return r;
	}
	
	
	public void transpose()
	{
		double[][] newMatrix = new double[this.matrix[0].length][this.matrix.length];
		
		for (int i=0; i<this.matrix.length; i++)
		{
			for (int j=0; j<this.matrix[0].length; j++)
			{
				newMatrix[j][i] = this.matrix[i][j];
			}
		}
		
		this.matrix = newMatrix;
	}
	
	public boolean isSymmetric()
	{
		boolean result;
		
		double[][] r = this.matrix.clone();
		transpose();
		result = this.equals(new Matrix(r));
		transpose();
		
		return result;
	}
	
	public double computeDeterminant()
	{
		if (this.matrix.length != this.matrix[0].length)
			throw new IllegalArgumentException("Die Matrix muss quadratisch sein.");
		
		if (this.matrix.length==1 && this.matrix[0].length==1)
			return this.matrix[0][0];
		
		double d = 0;
		
		Matrix m;
		double[][] newArray;
		int sign = 1;
		int offset;
		int a, b;
		double det;
		
		
		for (int i=0; i<this.matrix[0].length; i++)
		{
			
			newArray = new double[this.matrix.length-1][this.matrix[0].length-1];
			
			offset = 0;
			a=0;
			b=0;
			
			for (int j=1; j<this.matrix.length; j++)
			{
				b = 0;
				offset = 0;
				
				for (int k=0; k<this.matrix[i].length-1; k++)
				{
					
					if (k == i)
					{
						offset = 1;
					}
					
					newArray[a][b] = this.matrix[j][k + offset];
					b++;
				}
				a++;
			}
			
			m = new Matrix(newArray);
			
			det = m.computeDeterminant();
			d += (sign * matrix[0][i]) * det;
			
			sign *= -1;
		}
		
		return d;
	}
	
	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matrix other = (Matrix) obj;
		if (!Arrays.deepEquals(matrix, other.matrix))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		
		int le = String.valueOf(absolutBiggest()).length() + 2;
		
		
		for (int i=0; i<this.matrix.length; i++)
		{
			builder.append("[  ");
			
			for (int j=0; j<this.matrix[i].length; j++)
			{
				builder.append(this.matrix[i][j]);
				
				for (int k=0; k<(le - String.valueOf(this.matrix[i][j]).length()); k++)
				{
					builder.append(" ");
				}
			}
			
			builder.append("]")
				   .append("\n");
		}
		
		
		return builder.toString();
	}
}



