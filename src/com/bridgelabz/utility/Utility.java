package com.bridgelabz.utility;
import java.util.*;
import java.io.*;


public class Utility 
{   
	static Random rand = new Random();
	static Scanner sc=new Scanner(System.in);
	public static String ipstring() 
	{
		return sc.next();
	}
	public static int getnumber()
	{
		return sc.nextInt();
	}
	public static int getrandomInt()
	{
		return rand.nextInt();
	}
	public static double getrandomdouble()
	{
		return rand.nextDouble();
	}
	public static void rplcstring() 
	{
		String username="<user name>";
	    System.out.println("HEllo "+username+" ,How are you?"); 
		System.out.println("Enter username");
		String sc=ipstring();
	    username = username.replaceAll(username, sc);
		System.out.println("HEllo "+username+" ,How are you?");
			
	}
	public static void flipcoin(int number)
	{
		 int headcount=0,tailcount=0;
		 double per1,per2;
		 for(int i=0;i<number;i++)
		 {
		 double val=getrandomdouble();
		 if(val<0.5)
		 {
			 tailcount++;
		 }
		 else
			 headcount++;	
		 }
		 per1=(double)tailcount/number*100;
		 per2=(double)headcount/number*100;
		 System.out.println("Percentage of headount is "+per2);
		 System.out.println("percentage of tailcount is "+per1);
	}
	public static boolean leapyear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				else
					return false;
			}
			else
			return true;
		}
		else
		return false;
	}
	public void power(int number)
	{
		int power=1;
		for(int i=1;i<=number;i++)
		{
			power=power*2;
			System.out.println("power 2^"+i+" = "+power);
		}
		
	}
	public void harmonic(int number) 
	{
		double answer=0;
		for(int i=1;i<=number;i++)
		{
			answer=answer+1.0/i;
		}
		System.out.println("Harmonic number of "+number+" is "+answer);
		
	}
	public void primefactors(int number) 
	{
		System.out.println("Prime factors are");
		int factor,n,j;
		for(int i=2;i<number;i++)
		{
			n=i;
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					break;
				}
			}
			
			if(j==n);
			{
				if(number%n==0)
				{
					System.out.println(n);
				}
			}
		}
	}
	public int generatecoupon(int number) 
	{
			boolean[] isCollected=new boolean[number];
			int different=0;
			int count=0;
			while(different<number)
			{
				int value=(int)(Math.random()*number);
				count++;
				if(!isCollected[value])
				{
					different++;
					isCollected[value]=true;
				}
			
			}
		return count;
	}
	public int[] getArray(int n)
	{
		int Array[]=new int[n];
		System.out.println("enter your array");
		for(int i=0;i<n;i++)
		{
			
			Array[i]=getnumber();
		}
		return Array;
	}

	public void checksumzero(int Array[],int n)
	{
		int f=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(Array[i]+Array[j]+Array[k]==0)
					{
						System.out.println("Triplet is "+Array[i]+" "+Array[j]+" "+Array[k]);
						f++;
					}
					
						
					
				}
			}
		}
	if(f==0)
	{
		System.out.println("There are no Triplets of this array");
	}
	}
	public void getroots(int a, int b, int c) 
	{
		double delta=(b*b)-(4*a*c);
		int root1=(int) ((-b+Math.sqrt(delta))/2*a);
		int root2=(int) ((-b-Math.sqrt(delta))/2*a);
		System.out.println("Your first root is "+root1);
		System.out.println("Your second root is "+root2);
	}
	public double distance(int x, int y) 
	{
		int a;
		double dist;
		a=(int) (Math.pow(x, 2)+Math.pow(y, 2));
		dist=Math.sqrt(a);
		return dist;
	}
	public void windchill(int t, int v) 

	{
		 double x=Math.pow(v, 0.18);
		 double w =35.74+0.6215*t+(0.4275*t-35.75)*x;
		System.out.println(" "+w);
	}

	public void Orderd() 
{
int   x[ ] = new int[ 1000 ] ;
int   size , i ;

Scanner sc = new Scanner( System.in );
try
{
File  f = new File("number.txt");

if( !f.exists() )
{
System.out.println("number.txt file is unavailable.... ");
return;
}
FileReader  in = new FileReader( f );
BufferedReader  br = new BufferedReader( in );
i=0;
String str="";
while( (str=br.readLine( ) ) != null )
{
x[ i ] = Integer.parseInt( str );
System.out.println( x[ i ] );
i++;
}

size = i;
LinkedList  ob = new LinkedList();	
for( i=0 ; i < size ; i++)
{
ob.add( x[ i ] );
System.out.println( x[ i ] );
}

Collections.sort( ob );

Iterator<Integer>  il = ob.iterator() ;

while( il.hasNext() )
{
System.out.println( il.next() );
}

int  num;

System.out.println("enter new number = ");
num = sc.nextInt( );
int  pos = ob.indexOf( num ) ;

if( pos != -1 )
{
ob.remove( pos );
System.out.println("number found in lis, list after poping = ");
il = ob.iterator() ;	
while( il.hasNext() )
{
System.out.println( il.next( ));
}
}
else
{	
ob.add( num );
Collections.sort( ob );	
System.out.println("number found in lis, list after adding = ");
il = ob.iterator() ;	
while( il.hasNext() )
{	
System.out.println(  il.next() );
}
}

}catch(Exception  e)	
{
System.out.println("error = "+e);
}	
}
public static int day(int month, int day, int year) 
		{
	        int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        return d;
	    }
public static int getprime(int i) {
	int x;
	
	
	for(x=2;x<i;x++)
	{
		if(i%x==0)
		{
			break;
		}
	}
	if(i==x)
	{
		return x;
	
	}

	return 0;
	
}
public boolean chackAnageam(String str1, String str2) 
{

	
	str1 = str1.replaceAll("\\s" ," ");
	str2 = str2.replaceAll("\\s" ," ");
	int  l1 = str1.length( );
	int  l2 = str2.length( );
	if( l1 != l2 )
	{
		return false;
       //System.out.println("Please enter equal length string for checking they are angaram or not..");
	
	}

	char   arr1[ ] =  str1.toLowerCase().toCharArray();
	char   arr2[ ] =  str2.toLowerCase().toCharArray();
	Arrays.sort( arr1 );
	Arrays.sort( arr2 );
        
	
	
	if(Arrays.equals(arr1, arr2))
	{
	return true;
	}
	return false;
}
public static int[] getprimeArray()
{
int z=0;
int primes[]=new int[500];
	for(int i = 0;i<1000;i++)
	{ 
		int x=getprime(i);
		if(x!=0)
		{
		   primes[z]=x;
		   z++;
	    }
	
	}
	return primes;
}
public void writeDataToFile(String nWord)
{
	try{
		File fi=new File("List.txt");
      	fi.createNewFile();
      	FileWriter fw=new FileWriter(fi);
        fw.write(nWord);
        fw.close();
	}
	catch(IOException e){
	}
}
}
	
	