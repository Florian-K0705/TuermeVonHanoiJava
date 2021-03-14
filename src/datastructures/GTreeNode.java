package datastructures;

public class GTreeNode <T>
{
	public GTreeNode<T> rigth;
	public GTreeNode<T> left;
	public T data;
	
	
	public GTreeNode(T d) 
	{	
		this(d, null, null);
	}

	public GTreeNode(T d, GTreeNode<T> object, GTreeNode<T> object2) 
	{
		this.rigth = object;
		this.left = object2;
		this.data = d;
	}
}
