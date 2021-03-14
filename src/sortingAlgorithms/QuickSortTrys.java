package sortingAlgorithms;

public class QuickSortTrys 
{ 

    public static int[] intArr = RandomArray.create(10000000);

    public int[] sort(int l, int r) { 
        int q; 
        if (l < r) { 
            q = partition(l, r); 
            sort(l, q); 
            sort(q + 1, r); 
        } 
        return intArr; 
    } 

    int partition(int l, int r) { 

        int i, j, x = intArr[(l + r) / 2]; 
        i = l - 1; 
        j = r + 1; 
        while (true) { 
            do { 
                i++; 
            } while (intArr[i] < x); 

            do { 
                j--; 
            } while (intArr[j] > x); 

            if (i < j) { 
                int k = intArr[i]; 
                intArr[i] = intArr[j]; 
                intArr[j] = k; 
            } else { 
                return j; 
            } 
        } 
    } 

    public static void main(String[] args) { 
        QuickSortTrys qs = new QuickSortTrys(); 
        int[] arr = qs.sort(0, intArr.length - 1); 
        //System.out.println(Arrays.toString(arr));
    } 
}