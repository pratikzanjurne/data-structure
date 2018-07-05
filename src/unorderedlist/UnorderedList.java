package unorderedlist;

import	java.io.*;
import	java.util.*;

import com.bridgelabz.utility.Utility;

public  class  UnorderedList
{
	public static void main( String  args[ ] )
	{
		Utility u=new Utility();
		int   size , i ;

		Scanner sc = new Scanner( System.in );

		try
		{
			//String file="List.txt";
			File  f = new File( "List.txt" );

			if( !f.exists() )
			{
				System.out.println("number.txt file is unavailable.... ");
				return;
			}

			FileReader  in = new FileReader( f );
			BufferedReader  br = new BufferedReader( in );
	
			i=0;
			String  str="";
			String  data = "";

			while( (str=br.readLine( ) ) != null )
			{
				data = data + str;				
			}
			//System.out.println("data = "+data);
			String   x[ ]  = data.split(" ");
			
			
			LinkedList  ob = new LinkedList();			
			for( i=0 ; i < x.length ; i++)
			{
				ob.add( x[ i ] );
				//System.out.println( x[ i ] );
			}
	
			Iterator<String>  il = ob.iterator() ;

			while( il.hasNext() )
			{
				System.out.println( il.next( )  );
			}

			String  word;
			System.out.println("enter word for searching in files list = ");
			word = sc.next( );

			if( ob.contains( word ) )
			{
			    System.out.println("word is found in list ");
			    ob.remove( word );
			    f.createNewFile();
		      	FileWriter fw=new FileWriter(f);
		      	data=data.replace(word, "");
		        fw.write(data);
		        fw.close();

			}
			else
			{
			    System.out.println("word is not found in list ");
			    ob.add( word );
			    f.createNewFile();
		      	FileWriter fw=new FileWriter(f);
		      	data=data+"  "+word;
		        fw.write(data);
		        fw.close();
			}


			 System.out.println("data after opeartion  ");
			 il = ob.iterator() ;

			while( il.hasNext() )
			{
				System.out.println( il.next() );
			}
				
		}catch( Exception  e )		
		{
			System.out.println("error = "+e);
		}		
	}


}