package seachAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] arr = setArrayRandom(30);
		System.out.println(Arrays.toString(arr));

		System.out.println(search(arr, 5));
		
	}
	
    public static int look(int x, int[] xvec, int i1, int i2)
    {
//        System.out.println(i1+"  "+i2);
        if(i1 == i2-1) return i1;

        int i = (i1+i2)/2;
        if (x >= xvec[i])
           return look(x, xvec, i, i2);
        else
           return look(x, xvec, i1, i);
     }
	
    public static boolean search(int[] list, int searchedNumber)
    {
    	if (list.length == 0)
    	{
    		return false;
    	}
    	else if (list.length == 1)
    	{
    		if (list[0] != searchedNumber)
    		{
    			return false;
    		}
    	}
    	
    	//Arrays.sort(list);
    	boolean isNumberIn = false;
    	int half = list[(list.length - 1) / 2];
    	
    	if (half == searchedNumber)
    	{
    		isNumberIn = true;
    	}
		else if (half > searchedNumber)
    	{
    		int[] newList = iniArray(list, 0, ((list.length - 1) / 2));
    		isNumberIn = search(newList, searchedNumber);
    	}
    	else if (half < searchedNumber)
    	{
    		int[] newList = iniArray(list, ((list.length - 1) / 2 + 1), list.length - 1);
    		isNumberIn = search(newList, searchedNumber);
    	}
    	
    	return isNumberIn;
    	
    }
    
    public static int[] iniArray(int[] arr, int pos1, int pos2)
    {
    	if (pos1 < 0 | pos1 > arr.length | pos2 < 0 | pos2 > arr.length)
    	{
    		throw new IllegalArgumentException("Diese Positionen sind ungültig!");
    	}
    	
    	int[] newArr = new int[(pos2 - pos1) + 1];
    	int counter = 0;
    	
    	for (int i=pos1; i<=pos2; i++)
    	{
    		newArr[counter] = arr[i];
    		counter++;
    	}
    	
    	return newArr;
    }
	
	
	public static int[] setArrayRandom(int laenge1)
	{
		int[] array = new int[laenge1];
		
		for (int i = 0; i < array.length; i++) 	
		{	
			int aux = 10;
			array[i] = (int)((Math.random() * aux));
		}
		
		return array;
	}

}
