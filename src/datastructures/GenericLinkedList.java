package datastructures;

public class GenericLinkedList<T>
{
	private GNode<T> head;
	private int length;
	
	public GenericLinkedList()
	{
		this.head = null;
		this.length = 0;
	}
	
	public void remove(int index)
	{
		if (index>=this.length | index<0)
			return;
		
		if (index == 0)
		{
			GNode<T> newHead = head.getNext().copy();
			this.head.setNext(null);
			head = newHead;
			return;
		}
		
		GNode<T> tmp = head;
		
		for (int i=0; i<index-1; i++)
		{
			tmp = tmp.getNext();
		}
		
		this.length--;
		
		
		GNode<T> removedObject = tmp.getNext();
		tmp.setNext(removedObject.getNext());
		removedObject.setNext(null);
	}
	
	public T get(int index)
	{
		if (index>=this.length | index<0)
			return null;
		
		GNode<T> tmp = head;
		
		for (int i=0; i<index; i++)
		{
			tmp = tmp.getNext();
		}
		
		return tmp.getData();
	}
	
	public void insertFirst(T data)
	{
		GNode<T> tmp = new GNode<T>(data);
		tmp.setNext(head);
		this.head = tmp;
	}
	
	public void insertLast(T data)
	{
		if (head == null)
		{
			head = new GNode<T>(data, null);
			this.length += 1;
		}
		else
		{
			GNode<T> tmp = head;
			while (tmp.getNext() != null)
			{
				tmp = tmp.getNext();
			}
			
			tmp.setNext(new GNode<T>(data));
			this.length += 1;
		}
	}
	
	
	public int size()
	{
		return this.length;
	}
	
	public String toString()
	{
		StringBuilder b = new StringBuilder();
		
		GNode<T> tmp = this.head;
		b.append("[");
		
		while (tmp.getNext() != null)
		{
			b.append(tmp.getData());
			b.append(", ");
			tmp = tmp.getNext();
		}
		
		b.append(tmp.getData());
		b.append("]");
		
		return b.toString();
	}
	
	public Object[] toArray()
	{
		Object[] o = new Object[this.length];
		GNode<T> tmp = this.head;
		int c = 0;
		
		while (tmp != null)
		{
			o[c] = tmp.getData();
			tmp = tmp.getNext();
			c++;
		}
		
		return o;
	}
	
	/*
	 * TODO insertSorted() -> void
	 */
}
