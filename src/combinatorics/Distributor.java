package combinatorics;

import java.util.ArrayList;
import java.util.Random;

public class Distributor {

	static String[] playerNames;
	
	static int numberOfGroups = 2;
	static int numerOfPlayers;
	static Group[] finishedGroups = new Group[numberOfGroups];
	
	static ArrayList<Integer> hasChoosen = new ArrayList<>();
	
	
	
	public static void fillTeams()
	{
		
		if (numberOfGroups > numerOfPlayers)
			throw new IllegalArgumentException("Distribution impossible because number of Teams > number of Players.");
		
		if ((numerOfPlayers % numberOfGroups) == 0)
		{
			for (int i=0; i<numberOfGroups; i++)
			{
				finishedGroups[i] = allocatePlayer();
			}
		}
		else
		{
			for (int i=0; i<numberOfGroups; i++)
			{
				finishedGroups[i] = allocatePlayer();
			}

			
			Random r = new Random();
			int currentPlayer = r.nextInt(numerOfPlayers);
			
			for (int i=0; i<numerOfPlayers%numberOfGroups; i++)
			{
				while (hasChoosen.contains(currentPlayer))
				{
					currentPlayer = r.nextInt(numerOfPlayers);
				}
				
				hasChoosen.add(currentPlayer);
				finishedGroups[i].addPlayer(playerNames[currentPlayer]);
			}
		}
	}
	
	public static Group allocatePlayer()
	{
		Group team = new Group();
		Random r = new Random();

		int anzahl = (int) (numerOfPlayers / numberOfGroups);
		int current = r.nextInt(numerOfPlayers);
		
		for (int i=0; i<anzahl; i++)
		{
		
			while (hasChoosen.contains(current))
			{
				current = r.nextInt(numerOfPlayers);
			}
			
			hasChoosen.add(current);
			team.addPlayer(playerNames[current]);
		}
		
		
		return team;
		
	}
	
	/*
	 * Example Code
	 */
	public static void main(String[] args) 
	{
		playerNames = new String[] {"Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6"};
		numerOfPlayers = playerNames.length;
		
		fillTeams();
		
		for (int i=0; i<finishedGroups.length; i++)
		{
			System.out.println(finishedGroups[i]);
		}
	}

}
