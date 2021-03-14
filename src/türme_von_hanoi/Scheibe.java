package türme_von_hanoi;

public class Scheibe {
	
	private int g;
	
	public Scheibe(int g)
	{
		this.g = g;
	}

	public int getG()
	{
		return this.g;
	}

	@Override
	public String toString() {
		return "" + g + "";
	}
	
	
}
