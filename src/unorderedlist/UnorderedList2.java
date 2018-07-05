package unorderedlist;

import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility;

public class UnorderedList2
{
	static Node start;
	Utility  u=new Utility();
	ListUtility u1=new ListUtility();

	public UnorderedList2()
	{
		try
		{
			start=u1.readFile(start);
			System.out.print("Enter the word to search :");
			String word1=u.ipstring();
			start=u1.searchData(start,word1);
			String word2=" ";

			while(start!=null)
			{
				word2=word2+start.data1;
				word2=word2+" ";
				start=start.nextNode;
			}
			//  u1.writeToFile(start);
			u1.writeDataToFile(word2);
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}  		//End of method

	public static void main(String[] args)
	{
		UnorderedList2 u2=new UnorderedList2();
	}
}