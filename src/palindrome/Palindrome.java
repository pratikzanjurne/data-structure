package palindrome;

import   java.util.*;

import com.bridgelabz.utility.Utility;

class      PalindromStr
{
	public  static  void  main( String[ ]  args )
	{
		String str ;
		int size;
		Utility u=new Utility();
		System.out.println("Enter the string");
	    str=u.ipstring();
		Queue dequeA=new Queue();
		Object front;
		Object  rear;
		int     f = 0;
		for(int i=0;i<str.length();i++)
		{
		  dequeA.enqueue(str.charAt(i));
		}
		do
		{			
			front =dequeA.removeFront() ;
			if(dequeA.isEmpty())
			{				
				break;
			}	
			rear =dequeA.removeRear();
			if(front!=rear)
			{			
				f = 1;
				break;
			}

		}while(!dequeA.isEmpty());
		if( f == 1 )
		{
			System.out.println("strings is not palindrome");
		}	
		else
		{
			System.out.println("strings is palindrome");
		}
		
	}	
}