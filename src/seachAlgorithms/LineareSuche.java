package seachAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LineareSuche {

	public static void main(String[] args)
	{
		int z = whatNumber();
		int[] my_list = setArray(10);
		
		System.out.println(Arrays.toString(my_list));
		if (search(my_list, z))
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	public static boolean search(int[] list, int searchedNumber)
	{
		
		for (int i=0; i<list.length; i++)
		{
			if (list[i] == searchedNumber)
			{
				return true;
			}
		}
		
		return false;
		
	}
	
	public static int[] setArray(int laenge1)
	{
		int[] array = new int[laenge1];
		
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = (int) (Math.random() * 10) - 5;
		}
		
		return array;
	}
	
	public static int whatNumber()
	{
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Welche Zahl suchst du: ");
		n = scan.nextInt();
		scan.close();
		return n;
	}

}
