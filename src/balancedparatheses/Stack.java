package balancedparatheses;

public class Stack 
{
	int Size;
	long[] Array;
	int top;

	  
	public Stack(int s)
	  {
	    Size = s;
	    Array = new long[Size];
	    top = -1;
	  }
	   
	public void push(long j)
	  {
		Array[++top] = j;
	  }
	   
	public long pop() 
	  {
		return Array[top--];
	  }
	   
	public long peek() 
	  {
		return Array[top];
	  }
		   
	public boolean isEmpty()
	  {
		return (top == -1);
	  }
		   
	public boolean isFull()
	  {
		return (top == Size - 1);
	  }
}
