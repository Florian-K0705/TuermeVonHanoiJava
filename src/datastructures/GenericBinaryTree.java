package datastructures;

public class GenericBinaryTree <T>
{
	private GTreeNode<T> root;
	
	public GenericBinaryTree() 
	{
		this.root = null;
	}
	
	public GenericBinaryTree(GTreeNode<T> t)
	{
		this.root = t;
	}
	
	
	public GenericBinaryTree(T data)
	{
		root = new GTreeNode<T>(data);
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	
	/*
	 * TODO diese 3 unten stehenden Durchl‰ufe sind ‰uﬂert ineffizient, da
	 * sie bei jeder rekursion ein neues Objekt erzeugen. Die Anzahl dieser
	 * w‰chst eventuell schneller als exponentiell
	 */
	public void watchTreePraeOrder()
	{
		if (root==null)
			return;
		
		System.out.println(root.data);
		new GenericBinaryTree<T>(root.left).watchTreePraeOrder();
		new GenericBinaryTree<T>(root.rigth).watchTreePraeOrder();
	}
	
	public void watchTreePostOrder()
	{
		if (root==null) 
			return;
		GenericBinaryTree<T> left = new GenericBinaryTree<T>(root.left);
		GenericBinaryTree<T> right = new GenericBinaryTree<T>(root.rigth);
		
		left.watchTreePostOrder();		
		right.watchTreePostOrder();
		System.out.println(root.data);	
	}
	
	public void watchTreeInOrder()
	{
		if (root==null) 
			return;
		
		GenericBinaryTree<T> left = new GenericBinaryTree<T>(root.left);
		GenericBinaryTree<T> right = new GenericBinaryTree<T>(root.rigth);
		
		left.watchTreeInOrder();	
		System.out.println(root.data);
		right.watchTreeInOrder();

	}
}
