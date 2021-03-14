package sortingAlgorithms;

public class QuicksortV1
{
    private static int[] a;
    private int n;
    
    public static void main(String[] args) 
    { 
        
    	QuicksortV1 v = new QuicksortV1();
    	v.sort(RandomArray.create(100000000));
    	//System.out.println(Arrays.toString(a));
    	
    } 

    public void sort(int[] a)
    {
        this.a=a;
        n=a.length;
        quicksort(0, n-1);
    }

    private void quicksort (int lo, int hi)
    {
        int i=lo, j=hi;

        // Vergleichselement x
        int x=a[lo+(hi-lo)/2];

        //  Auf­teilung
        while (i<=j)
        {    
            while (a[i]<x) i++; 
            while (a[j]>x) j--;
            if (i<=j)
            {
                exchange(i, j);
                i++; j--;
            }
        }

        // Rekursion
        if (lo<j) quicksort(lo, j);
        if (i<hi) quicksort(i, hi);
    }

    private void exchange(int i, int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

}
