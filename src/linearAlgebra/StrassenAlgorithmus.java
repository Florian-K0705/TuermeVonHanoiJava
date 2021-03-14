package linearAlgebra;

public class StrassenAlgorithmus {

	/*
	 * NOCH NICHT FERTIG
	 */
	
	// Der Algoritmus erwartet eine nxn-Matrix, wobei n eine Potenz von 2 ist.
	
	public static double[][] multiply(double[][] A, double[][] B)
	{
		if (!(A.length == A[0].length && B.length == B[0].length && A.length==B.length))
			return null;
		
		int n1 = A.length;
		int n2 = B.length;
		
		double[][] A11 = new double[n1/2][n1/2];
		double[][] A12 = new double[n1/2][n1/2];
		double[][] A21 = new double[n1/2][n1/2];
		double[][] A22 = new double[n1/2][n1/2];

		
		double[][] B11 = new double[n2/2][n2/2];
		double[][] B12 = new double[n2/2][n2/2];
		double[][] B21 = new double[n2/2][n2/2];
		double[][] B22 = new double[n2/2][n2/2];
		
		return null;
	}
	
	public static void main(String[] args)
	{

	}

}
