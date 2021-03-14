package t�rme_von_hanoi;
import java.util.Stack;

public class T�rmeVonHanoi 
{
	int number;
	
	Stack<Scheibe>[] t�rme = new Stack[3];
	int counter = 0;
	
	public T�rmeVonHanoi(int n)
	{
		this.number = n;
		
		Stack<Scheibe> turm1 = new Stack<Scheibe>();
		Stack<Scheibe> turm2 = new Stack<Scheibe>();
		Stack<Scheibe> turm3 = new Stack<Scheibe>();
		
		for (int i=n; i>=1; i--)
			turm1.push(new Scheibe(i));
		
		t�rme[0] = turm1;
		t�rme[1] = turm2;
		t�rme[2] = turm3;
	}
	
	public void solve()
	{
		drawT�rme();
		this.solve(t�rme[0].size(), 0, 2);
	}
	
	private void solve(int n, int sT, int zT)
	{
		int tmpTurm = ((sT+zT) * 2) % 3;
		
		
		if (n > 1)
		{
			solve(n-1, sT, tmpTurm);
		}
		
		t�rme[zT].push(t�rme[sT].pop());
		counter++;
		
		
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		drawT�rme();
		
		if (n > 1)
		{
			solve(n-1, tmpTurm, zT);
		}
		
		
	}
	
	private void printT�rme()
	{
		System.out.println("{");
		System.out.println(t�rme[0]);
		System.out.println(t�rme[1]);
		System.out.println(t�rme[2]);
		System.out.println("{");
	}
	
	
	private void drawT�rme()
	{
		int g = 0;
		int breite = 0;
		
		int depth = number;
		int delta = 3;
		int minus1 = 0;
		int minus2 = 0;
		int minus3 = 0;
		
		
		for (int i=0; i<2*number; i++)
		{
			
			if (i % 2 == 0)
			{
				//------Turm 1---------
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				
				System.out.print("|");
				
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				
				//------Turm 1---------
				
				
				for (int j=0; j<delta; j++)
				{
					System.out.print(" ");
				}
				
				
				//------Turm 2---------
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				
				System.out.print("|");
				
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				//------Turm 2---------
				
				
				for (int j=0; j<delta; j++)
				{
					System.out.print(" ");
				}
				
				
				//------Turm 3---------
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				
				System.out.print("|");
				
				for (int j=0; j<number; j++)
				{
					System.out.print(" ");
				}
				//------Turm 3---------
				
				System.out.println();
				
			}
			else
			{
				//------Turm1---------
				
				
				if (t�rme[0].size() >= depth)
				{
					g = t�rme[0].get((t�rme[0].size()-1)-minus1).getG();
					breite = 2 * g + 1;
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					drawScheibe(breite);
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					minus1++;
				}
				else
				{
					for (int j=0; j<2*number+1; j++)
					{
						System.out.print(" ");
					}
				}
				
				//------Turm1---------
				
				
				
				for (int j=0; j<delta; j++)
				{
					System.out.print(" ");
				}
				
				
				//------Turm2---------
				
				if (t�rme[1].size() >= depth)
				{
					g = t�rme[1].get((t�rme[1].size()-1)-minus2).getG();
					breite = 2 * g + 1;
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					drawScheibe(breite);
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					
					minus2++;
				}
				else
				{
					for (int j=0; j<2*number+1; j++)
					{
						System.out.print(" ");
					}
				}
				
				
				//------Turm2---------
				
				
				for (int j=0; j<delta; j++)
				{
					System.out.print(" ");
				}
				
				
				//------Turm3---------
				
				if (t�rme[2].size() >= depth)
				{
					g = t�rme[2].get((t�rme[2].size()-1)-minus3).getG();
					breite = 2 * g + 1;
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					drawScheibe(breite);
					
					for (int j=0; j<number-g; j++)
					{
						System.out.print(" ");
					}
					
					minus3++;
				}
				else
				{
					for (int j=0; j<2*number+1; j++)
					{
						System.out.print(" ");
					}
				}
				
				//------Turm3---------
				
				System.out.println();
				depth--;
			}
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	private void drawScheibe(int breite)
	{
		for (int j=0; j<breite; j++)
		{
			System.out.print("x");
		}
		
	}
	
}