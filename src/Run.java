package t�rme_von_hanoi;

import java.util.Scanner;
import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gib die Anzahl der Scheiben an: ");
		int number = scanner.nextInt();
		
		if (number > 0)
		{
			if (number < 10)
			{
				T�rmeVonHanoi t = new T�rmeVonHanoi(number);
				
				t.solve();
				
				System.out.println("Es wurden " + t.counter + " Scheiben verschoben");
			}
			else
			{
				System.out.println("Das sind leider zuviele Scheiben.");
				System.out.print("M�chtest du es totzdem probieren [y/n]: ");
				
				String ans = scanner.next();
				
				if (ans.equals("y"))
				{
					T�rmeVonHanoi t = new T�rmeVonHanoi(number);
					
					t.solve();
					
					System.out.println("Es wurden " + t.counter + " Scheiben verschoben");
				}
			}
		}
		
	}

}
