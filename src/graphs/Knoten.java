package graphs;

public class Knoten 
{

	public final String id;
	public String farbe = "weiﬂ";
	public Knoten pi;
	public int d;
	public int f;
	
	public Knoten(String id) 
	{
		this.id = id;
		this.pi = null;
	}
	
	
	@Override
	public String toString() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knoten other = (Knoten) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
