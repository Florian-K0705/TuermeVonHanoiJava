package datastructures;

public class GNode <T>
{
	private T data;
	private GNode <T> next;
	
	
	public GNode(T data)
	{
		this(data, null);
	}
	public GNode(T data, GNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	
	public GNode<T> copy()
	{
		return new GNode<T>(this.data, this.next);
	}
	
	
	public T getData()
	{
		return this.data;
	}
	public GNode <T> getNext()
	{
		return this.next;
	}
	
	public void setData(T data)
	{
		this.data = data;
	}
	public void setNext(GNode <T> next)
	{
		this.next = next;
	}
	
}
