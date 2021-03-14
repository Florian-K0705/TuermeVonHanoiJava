package combinatorics;
import java.util.ArrayList;
import java.util.List;

public class Group 
{
	List<String> team;
	
	public Group()
	{
		team = new ArrayList<String>();
	}
	
	
	public void addPlayer(String player)
	{
		team.add(player);
	}
	
	public boolean isEmpty()
	{
		return team.isEmpty();
	}
	
	@Override
	public String toString() {
		return team.toString();
	}
	
	
}
