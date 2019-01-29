/**
 * @author (Karol Pawlak)
 * @date (December 2018)
 * @description (Implements the operations of the stack)
 */

public class Test 
{

	public static void main(String[] args) 
	{
		//testing functionality of the stack
		stackInterface stack; 
		stack = new staticStack(3);
		
		System.out.println("Empty: " + stack.isEmpty());
		
		stack.push(5);
		stack.push(1);
		stack.push(2);
		
		System.out.print("Stack: ");
		stack.print();
		System.out.println("") ;

		System.out.println("Popped item: " + stack.pop());
		
		System.out.print("Stack: ");
		stack.print();
		System.out.println("") ;
		
		System.out.println("Popped item: " + stack.pop());
		
		System.out.print("Stack: ");
		stack.print();
		System.out.println("") ;
		
		System.out.println("Popped item: " + stack.pop());
		
		System.out.print("Stack: ");
		stack.print();
		System.out.println("") ;
	}

}
