package türme_von_hanoi;

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
				TürmeVonHanoi t = new TürmeVonHanoi(number);
				
				t.solve();
				
				System.out.println("Es wurden " + t.counter + " Scheiben verschoben");
			}
			else
			{
				System.out.println("Das sind leider zuviele Scheiben.");
				System.out.print("Möchtest du es totzdem probieren [y/n]: ");
				
				String ans = scanner.next();
				
				if (ans.equals("y"))
				{
					TürmeVonHanoi t = new TürmeVonHanoi(number);
					
					t.solve();
					
					System.out.println("Es wurden " + t.counter + " Scheiben verschoben");
				}
			}
		}
		
	}

}
