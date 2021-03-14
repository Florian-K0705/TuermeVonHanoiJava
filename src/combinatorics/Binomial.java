package combinatorics;

public class Binomial {
	
    public static void main(String[] args)
    {
        System.out.println(binomialCoefficient(1000, 5));
    }

    
    /*
     * Es gibt definitiv ein schnelleres Verfahren (siehe Wikipedia)
     * 
     * Zum Test soll 1000 über 5 im burchteil einer sekunde berechnet werden!
     * 
     */
    public static double binomialCoefficient(int n, int k)
    {
        if (k == 0)
            return 1;
        else if (n < k)
            return 0;
        else
            return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }
}
