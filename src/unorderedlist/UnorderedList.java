package unorderedlist;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;
public class UnorderedList 
{
    private static BufferedReader br;

	public static void main(String[] args) throws FileNotFoundException
	{
        Utility u=new Utility();
        try
		{
        		File  f = new File( "List.txt" );
        		if( !f.exists() )
        			{
        				System.out.println("List.txt file is unavailable.... ");
        			}
        		FileReader  in = new FileReader( f );
        		br = new BufferedReader( in );
        		int i=0;
        		String  str="";
        		String  data = "";

        		while( (str=br.readLine( ) ) != null )
        			{
        				data = data + str;	
        			}
        		System.out.println("data = "+data);
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
        		word = u.ipstring();

        		if( ob.contains( word ) )
        			{
        				System.out.println("word is found in list ");
        				ob.remove( word );
        			}
        		else
        			{
        				System.out.println("word is not found in list ");
        				ob.add( word );
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
                                   