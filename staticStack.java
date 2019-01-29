/**
 * @author (Karol Pawlak)
 * @date (December 2018)
 * @description (Implements the operations of the stack)
 */

public class staticStack implements stackInterface
{
	//--------------------------------------------
	//attributes
	//--------------------------------------------
	private int[] list;
	private int numItems;
	private int maxItems;
	
	
	
	//--------------------------------------------
	//constructor
	//--------------------------------------------
	public staticStack(int max)
	{
		list = new int[max];
		numItems = 0;
		maxItems = max;
	}
	
	//--------------------------------------------
	//operations
	//--------------------------------------------
	public boolean isEmpty()
	{
		boolean empty;
		
		if (numItems == 0)
		{
			empty = true;
		}
		else 
		{
			empty = false;
		}
		
		return empty;
	}
	
	public void push(int item)
	{
		if (numItems < maxItems)
		{
			list[numItems] = item;
			numItems++;
		}
		else
		{
			System.out.println("Stack is full!");
		}
	}
	
	public int pop()
	{
		if (isEmpty() == false)
		{
			int poppedItem = list[numItems -1];
			numItems--;
			return poppedItem;
		}
		else
		{
			System.out.println("Stack is empty!");
			return -1;
		}
	}
	
	public void print()
	{
		for(int i = (numItems - 1); i >= 0; i--) 
		{
			System.out.print(list[i] + " ");
		}
	}

}
