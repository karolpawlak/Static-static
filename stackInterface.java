/**
 * @author (Karol Pawlak)
 * @date (December 2018)
 * @description (This interface contains operations of the static stack)
 */

public interface stackInterface 
{
	//Op.1 - Returns if the stack is empty or not.
	public boolean isEmpty();
	
	//Op.2 - Pops the item from the top of the stack and returns that item.
	public int pop();
	
	//Op.3 - Pushes an item on top of the stack.
	public void push(int item);
	
	//Op.4 - Prints contents of the stack.
	public void print();
}
