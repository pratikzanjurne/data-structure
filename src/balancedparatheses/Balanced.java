package balancedparatheses;
import com.bridgelabz.utility.Utility;

public class Balanced
{
	public static void main(String[] args) 
	{
		Utility u=new Utility();
		System.out.println("Enter size of your equation");
		int n=u.getnumber();
	    Stack stack = new Stack(n);
		System.out.println("Enter your expression: ");
		String equ = u.ipstring();        
		int length = equ.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < length; i++)
		{    
		char a = equ.charAt(i);

			if (a == '(')
			{
			stack.push(i);
			}
		    else if (a == ')')
				{
					
					long b=stack.pop();
					System.out.println("')' at index "+(i+1)+" matched with '(' at index "+b+1);
				}            
		}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		}
		if(stack.isEmpty())
		{
			System.out.println("Your expression is Balanced");
		}
    }
 }
